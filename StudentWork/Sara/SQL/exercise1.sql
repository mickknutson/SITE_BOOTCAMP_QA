-- ##1##
CREATE TABLE shop (
article INT(4) UNSIGNED ZEROFILL DEFAULT '0000'  NOT NULL,
dealer VARCHAR(20) DEFAULT '' NOT NULL,  
price DOUBLE(16,2)DEFAULT '0.00' NOT NULL,
PRIMARY KEY(article, dealer));
-- OUTPUT:
-- Query OK, 0 rows affected, 3 warnings (0.53 sec)

-- ##2##
INSERT INTO shop VALUES  (
 1,'A',3.45),(1,'B',3.99),(2,'A',10.99),
(3,'B',1.45),(3,'C',1.69),(3,'D',1.25),(4,'D',19.95);
-- OUTPUT:
-- Query OK, 7 rows affected (0.14 sec)
-- Records: 7  Duplicates: 0  Warnings: 0

-- ##3##
SELECT MAX(article) AS article FROM shop;
-- OUTPUT:
-- +---------+
-- | article |
-- +---------+
-- |       4 |
-- +---------+
-- 1 row in set (0.05 sec)

-- ##4##
SELECT article, dealer, price  FROM shop
WHERE price=(SELECT MAX(price) FROM shop);
-- OUTPUT:
-- +---------+--------+-------+
-- | article | dealer | price |
-- +---------+--------+-------+
-- |    0004 | D      | 19.95 |
-- +---------+--------+-------+
-- 1 row in set (0.00 sec)

-- ##5##
SELECT article, dealer, price  FROM shop
ORDER BY price DESC  LIMIT 1;
-- OUTPUT:
-- +---------+--------+-------+
-- | article | dealer | price |
-- +---------+--------+-------+
-- |    0004 | D      | 19.95 |
-- +---------+--------+-------+
-- 1 row in set (0.04 sec)

-- ##6##
SELECT article, MAX(price) 
AS price  
FROM shop
GROUP BY article;
-- OUTPUT:
-- +---------+-------+
-- | article | price |
-- +---------+-------+
-- |    0001 |  3.99 |
-- |    0002 | 10.99 |
-- |    0003 |  1.69 |
-- |    0004 | 19.95 |
-- +---------+-------+
-- 4 rows in set (0.00 sec)

-- ##7##
SELECT article, dealer, price  
FROM shop s1
WHERE price=(
SELECT MAX(s2.price)
FROM shop s2
WHERE s1.article = s2.article); 
-- OUTPUT:
-- +---------+--------+-------+
-- | article | dealer | price |
-- +---------+--------+-------+
-- |    0001 | B      |  3.99 |
-- |    0002 | A      | 10.99 |
-- |    0003 | C      |  1.69 |
-- |    0004 | D      | 19.95 |
-- +---------+--------+-------+
-- 4 rows in set (0.00 sec)

