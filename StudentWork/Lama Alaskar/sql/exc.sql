
-- exc 1

INSERT INTO pet 
VALUES ('Hammy','Mick','squirell','f', '1999-03-30',NULL);
--
SELECT [what_to_select]
FROM [which_table]
WHERE [conditions_to_satisfy]
--
SELECT *
FROM pet
WHERE name = 'Hammy';
--
SELECT species, gender, count(*) 
FROM pet 
WHERE species =  'squirell' or species = 'cat' GROUP BY species, gender;

--

CREATE TABLE pet (
    name VARCHAR(20),
    owner VARCHAR(20),
    species VARCHAR(20),
    gender CHAR(1),
    birth DATE, death DATE);
--

CREATE TABLE shop (
article INT(4) UNSIGNED ZEROFILL DEFAULT '0000'  NOT NULL,
dealer VARCHAR(20) DEFAULT '' NOT NULL,  price DOUBLE(16,2) DEFAULT '0.00' NOT NULL,
PRIMARY KEY(article, dealer));

--

INSERT INTO shop VALUES  (1,'A',3.45),(1,'B',3.99),(2,'A',10.99),
(3,'B',1.45),
(3,'C',1.69),(3,'D',1.25),(4,'D',19.95);

-- exc 2

CREATE TABLE person (
id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
name VARCHAR (60) NOT NULL,
PRIMARY KEY (id)
);

--  
CREATE TABLE shirt (
id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
style ENUM ('t-shirt' , 'polo', 'dress') NOT NULL, 
color ENUM ('red' , 'blue', 'orange' , 'white' ,'black') NOT NULL,
owner SMALLINT UNSIGNED NOT NULL REFERENCES 
person(id),
PRIMARY KEY (id)
);

--

INSERT INTO PERSON VALUES (NULL, 'ANTONIO PAZ');
SELECT @LAST := LAST_INSERT_ID();
INSERT INTO SHIRT VALUES (NULL, 'POLO','BLUE',@LAST),
(NULL, 'DRESS','WHITE',@LAST),(NULL, 't-SHIRT','BLUE',@LAST);

--

INSERT INTO PERSON VALUES (NULL, 'LILLIANA ANGELOVSKA');
SELECT @LAST := LAST_INSERT_ID();
INSERT INTO SHIRT VALUES (NULL, 'DRESS','ORANGE',@LAST),
(NULL, 'POLO','RED',@LAST),(NULL, 'DRESS','BLUE',@LAST),
(NULL, 't-SHIRT','WHITE',@LAST);

--


SELECT S.*
FROM PERSON P INNER JOIN SHIRT S 
ON S.OWNER = P.ID WHERE P.NAME 
LIKE '%LILLIANA%' AND S.COLOR <> 'WHITE';

--


