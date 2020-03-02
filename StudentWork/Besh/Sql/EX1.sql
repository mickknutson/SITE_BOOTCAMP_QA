CREATE TABLE shop (
article INT(4) UNSIGNED ZEROFILL DEFAULT '0000'  NOT NULL,
dealer VARCHAR(20) DEFAULT '' NOT NULL,  price DOUBLE(16,2) DEFAULT '0.00' NOT NULL,
PRIMARY KEY(article, dealer));

INSERT INTO shop VALUES  (1,'A',3.45),(1,'B',3.99),(2,'A',10.99),
(3,'B',1.45),
(3,'C',1.69),(3,'D',1.25),(4,'D',19.95);
/////////////////////


INSERT INTO pet 
VALUES ('Hammy','Mick','squirell','f', '1999-03-30',NULL);




SELECT [what_to_select]
FROM [which_table]
WHERE [conditions_to_satisfy]




SELECT *
FROM pet
WHERE name = 'Hammy';





SELECT species, gender, count(*) 
FROM pet 
WHERE species =  'squirell' or species = 'cat' GROUP BY species, gender;
