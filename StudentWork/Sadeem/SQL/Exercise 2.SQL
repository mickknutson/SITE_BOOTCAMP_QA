CREATE TABLE person(
id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
name VARCHAR(60) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE shirt(
id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
style ENUM('t-shirt', 'polo', 'dress') NOT NULL,
color ENUM ('red', 'blue', 'orange', 'white', 'black') NOT NULL,
owner SMALLINT UNSIGNED NOT NULL REFERENCES person(id),
PRIMARY KEY (id)
);

INSERT INTO person VALUES (NULL, 'Antonio Paz');

SELECT @last :=LAST_INSERT_ID();

INSERT INTO shirt VALUES
(NULL,'polo', 'blue', @last),
(NULL, 'dress', 'white', @last),
(NULL, 't-shirt', 'blue', @last);

INSERT INTO person VALUES (NULL, 'Lilliana Angelovska');

SELECT @last :=LAST_INSERT_ID();

INSERT INTO shirt VALUES 
(NULL,'dress','orange',@last),
(NULL,'polo','red',@last),
(NULL,'dress','blue',@last),
(NULL,'t-shirt','white',@last);

SELECT s.*
FROM person p INNER JOIN shirt s ON s.owner =  p.id
WHERE p.name LIKE '%Lilliana%' AND s.color <>  'white';
