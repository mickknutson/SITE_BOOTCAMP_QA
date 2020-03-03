#1
CREATE TABLE person(
id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT, name VARCHAR(60) NOT NULL, PRIMARY KEY (id));
-- OUTPUT: 
-- Query OK, 0 rows affected (0.01 sec)

#2
CREATE TABLE shirt(
id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
style ENUM('t-shirt','polo','dress')NOT NULL,
color ENUM('red','blue','orange','white','black')NOT NULL,
owner SMALLINT UNSIGNED NOT NULL 
REFERENCES person (id), PRIMARY KEY (id));
-- OUTPUT: 
-- Query OK, 0 rows affected (0.01 sec)

#3
INSERT INTO person VALUES (NULL,'Antonio Paz');
-- OUTPUT: 
-- Query OK, 1 row affected (0.00 sec)

#4
SELECT @last := LAST_INSERT_ID();
-- OUTPUT:
-- +---------------------------+
-- | @last := LAST_INSERT_ID() |
-- +---------------------------+
-- |                         1 |
-- +---------------------------+
-- 1 row in set, 1 warning (0.00 sec)


#5
INSERT INTO shirt VALUES
(NULL,'polo','blue', @last),
(NULL,'dress','white', @last),
(NULL,'t-shirt','blue', @last);
-- OUTPUT: 
-- Query OK, 3 rows affected (0.00 sec)
-- Records: 3  Duplicates: 0  Warnings: 0

#6
INSERT INTO person VALUES (NULL, 'Liliana Angeloveska');
-- OUTPUT: Query OK, 1 row affected (0.01 sec)

#7
SELECT @last := LAST_INSERT_ID();
-- OUTPUT:
-- +---------------------------+
-- | @last := LAST_INSERT_ID() |
-- +---------------------------+
-- |                         2 |
-- +---------------------------+
-- 1 row in set, 1 warning (0.00 sec)

#8
INSERT INTO shirt VALUES
(NULL,'dress','orange', @last),
(NULL,'polo','red', @last),
(NULL, 'dress', 'blue', @last),
(NULL,'t-shirt','white', @last);
-- OUTPUT: 
-- Query OK, 4 rows affected (0.01 sec)
-- Records: 4  Duplicates: 0  Warnings: 0

#9
SELECT s.*
FROM person p INNER JOIN shirt s ON 
s.owner = p.id
WHERE p.name LIKE '%Lilliana%' AND  
s.color <> 'white';
-- OUTPUT:
-- +----+-------+--------+-------+
-- | id | style | color  | owner |
-- +----+-------+--------+-------+
-- |  4 | dress | orange |     2 |
-- |  5 | polo  | red    |     2 |
-- |  6 | dress | blue   |     2 |
-- +----+-------+--------+-------+
-- 3 rows in set (0.01 sec)








