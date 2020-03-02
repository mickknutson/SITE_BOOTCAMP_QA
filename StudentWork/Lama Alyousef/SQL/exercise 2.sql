CREATE TABLE person(
 ID SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
 NAME VARCHAR (60) NOT NULL,
 PRIMARY KEY (ID));

CREATE TABLE shirt(
ID SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT, 
STYLE ENUM('t-SHIRT','POLO','DRESS')NOT NULL,
COLOR ENUM('RED','BLUE','ORANGE','WHITE','BLACK')NOT NULL,
OWNER SMALLINT UNSIGNED NOT NULL REFERENCES PERSON (ID),
PRIMARY KEY(ID));



INSERT INTO PERSON VALUES (NULL, 'LILLIANA ANGELOVSKA');
SELECT @LAST := LAST_INSERT_ID();


INSERT INTO shirt VALUES
(NULL,'dress','orange',@LAST),
(NULL,'polo','red',@LAST),
(NULL,'dress','blue',@LAST),
(NULL,'t-shirt','white',@LAST);

-- Find out person names containing  “Lilliana” as a string and having a shirt  of any color but not white:

SELECT s.*
FROM person p INNER JOIN shirt s ON s.owner = p.id
WHERE p.name LIKE '%Lilliana%' AND s.color <> 'white';

