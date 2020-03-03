CREATE TABLE shop (
article INT(4) UNSIGNED ZEROFILL DEFAULT '0000'  NOT NULL,
dealer VARCHAR(20) DEFAULT '' NOT NULL,  price DOUBLE(16,2) DEFAULT '0.00' NOT NULL,
PRIMARY KEY(article, dealer));

INSERT INTO shop VALUES  (1,'A',3.45),(1,'B',3.99),(2,'A',10.99),
(3,'B',1.45),
(3,'C',1.69),(3,'D',1.25),(4,'D',19.95);

--   Find the highest price per article.
SELECT article, MAX(price) AS price  FROM shop
GROUP BY article;
-- +---------+
-- | article |
-- +---------+
-- |       4 |
-- +---------+
--    For each article, find the dealer(s)with  the most expensive price.
SELECT article, dealer, price  FROM shop s1
WHERE price=(SELECT MAX(s2.price)
FROM shop s2
WHERE s1.article = s2.article); 

-- +---------+--------+-------+
-- | article | dealer | price |
-- +---------+--------+-------+
-- |    0004 | D      | 19.95 |
-- +---------+--------+-------+
SELECT article, dealer, price  FROM shop s1
     WHERE price=(SELECT MAX(s2.price)
     FROM shop s2
     WHERE s1.article = s2.article);

-- | article | dealer | price |
-- +---------+--------+-------+
-- |    0001 | B      |  3.99 |
-- |    0002 | A      | 10.99 |
-- |    0003 | C      |  1.69 |
-- |    0004 | D      | 19.95 |
-- +---------+--------+-------+

CREATE TABLE person(
ID SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT, NAME VARCHAR (60) NOT NULL, PRIMARY KEY (ID));

CREATE TABLE SHIRT(
ID SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT, STYLE ENUM('t-SHIRT','POLO','DRESS')NOT NULL,COLOR ENUM('RED','BLUE','ORANGE','WHITE','BLACK')NOT NULL,OWNER SMALLINT UNSIGNED NOT NULL REFERENCES PERSON (ID),PRIMARY KEY(ID));

INSERT INTO PERSON VALUES (NULL, 'ANTONIO PAZ');
SELECT @LAST := LAST_INSERT_ID();
INSERT INTO SHIRT VALUES (NULL, 'POLO','BLUE',@LAST),(NULL, 'DRESS','WHITE',@LAST),(NULL, 't-SHIRT','BLUE',@LAST);

INSERT INTO PERSON VALUES (NULL, 'LILLIANA ANGELOVSKA');
SELECT @LAST := LAST_INSERT_ID();
-- +---------------------------+
-- | @LAST := LAST_INSERT_ID() |
-- +---------------------------+
-- |                         1 |
-- +---------------------------+
INSERT INTO SHIRT VALUES (NULL, 'DRESS','ORANGE',@LAST),(NULL, 'POLO','RED',@LAST),(NULL, 'DRESS','BLUE',@LAST),(NULL, 't-SHIRT','WHITE',@LAST);

SELECT S.*
FROM PERSON P INNER JOIN SHIRT S ON S.OWNER = P.ID WHERE P.NAME LIKE '%LILLIANA%' AND S.COLOR <> 'WHITE';
-- +----+-------+--------+-------+
-- | ID | STYLE | COLOR  | OWNER |
-- +----+-------+--------+-------+
-- |  4 | DRESS | ORANGE |     2 |
-- |  5 | POLO  | RED    |     2 |
-- |  6 | DRESS | BLUE   |     2 |
-- +----+-------+--------+-------+