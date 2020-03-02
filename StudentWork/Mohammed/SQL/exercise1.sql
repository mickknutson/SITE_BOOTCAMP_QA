## EXERCIE 1

CREATE TABLE shop (
article INT(4) UNSIGNED ZEROFILL DEFAULT '0000'  NOT NULL,
dealer VARCHAR(20) DEFAULT '' NOT NULL,  price DOUBLE(16,2) DEFAULT '0.00' NOT NULL,
PRIMARY KEY(article, dealer));

INSERT INTO shop VALUES
(1,'A',3.45),
(1,'B',3.99),
(2,'A',10.99),
(3,'B',1.45),
(3,'C',1.69),
(3,'D',1.25),
(4,'D',19.95);

##Find out the highest item article ...
 -- ANSWER :
--- > RIGHT ANSWER :
SELECT MAX(article) AS article FROM shop;
-- > MY ANSWER : 
SELECT MAX(article) FROM shop;

## Find the article, dealer, and price of the  most expensive article ...
-- ANSWER : 
SELECT article, dealer, price  FROM shop
WHERE price=(SELECT MAX(price) FROM shop);

## Find the highest price per article.
 -- answer :
SELECT article, MAX(price) AS price  FROM shop
GROUP BY article;

## For each article, find the dealer(s)with  the most expensive price ...
-- ANSWER 
SELECT article, dealer, price  FROM shop s1
WHERE price=(SELECT MAX(s2.price)
FROM shop s2
WHERE s1.article = s2.article); 