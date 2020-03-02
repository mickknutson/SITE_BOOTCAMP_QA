CREATE TABLE shop (
article INT(4) UNSIGNED ZEROFILL DEFAULT '0000'  NOT NULL,
dealer VARCHAR(20) DEFAULT '' NOT NULL,  price DOUBLE(16,2) DEFAULT '0.00' NOT NULL,
PRIMARY KEY(article, dealer));





INSERT INTO shop VALUES  (1,'A',3.45),(1,'B',3.99),(2,'A',10.99),
(3,'B',1.45),
(3,'C',1.69),(3,'D',1.25),(4,'D',19.95);





SELECT article, dealer, price  FROM shop
ORDER BY price DESC  LIMIT 1;

SELECT article, dealer, price  FROM shop
WHERE price=(SELECT MAX(price) FROM shop);


+---------+--------+-------+
| article | dealer | price |
+---------+--------+-------+
|    0004 | D      | 19.95 |
+---------+--------+-------+
1 row in set (0.00 sec)


SELECT article, MAX(price) AS price  FROM shop
GROUP BY article;

+---------+-------+
| article | price |
+---------+-------+
|    0001 |  3.99 |
|    0002 | 10.99 |
|    0003 |  1.69 |
|    0004 | 19.95 |
+---------+-------+
4 rows in set (0.00 sec)



SELECT article, dealer, price  FROM shop s1
WHERE price=(SELECT MAX(s2.price)
FROM shop s2
WHERE s1.article = s2.article); 	


+---------+--------+-------+
| article | dealer | price |
+---------+--------+-------+
|    0001 | B      |  3.99 |
|    0002 | A      | 10.99 |
|    0003 | C      |  1.69 |
|    0004 | D      | 19.95 |
+---------+--------+-------+
4 rows in set (0.00 sec)








create table shirt (id smallint unsigned not null auto_increment, style ENUM('t-shirt','polo','orange','white','black') not null, owner smallint unsigned not null references person(id), primary key (id));


+-------+-------------------------------------------------+------+-----+---------+----------------+
| Field | Type                                            | Null | Key | Default | Extra          |
+-------+-------------------------------------------------+------+-----+---------+----------------+
| id    | smallint unsigned                               | NO   | PRI | NULL    | auto_increment |
| style | enum('t-shirt','polo','orange','white','black') | NO   |     | NULL    |                |
| owner | smallint unsigned                               | NO   |     | NULL    |                |
+-------+-------------------------------------------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)




insert into person values (null, 'Antoino Par');


insert into person values (null, 'Lilliana Angelovska');



