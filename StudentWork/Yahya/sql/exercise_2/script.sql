--precondition
-- following script is needed to complete excersize 2


-- person table
CREATE TABLE person (
id SMALLINT unsigned not NULL AUTO_INCREMENT,
name varchar(60) not NULL,
PRIMARY KEY (id)
);

--shirt table
CREATE TABLE shirt (
id SMALLINT unsigned not NULL AUTO_INCREMENT,
style ENUM('t-shirt' , 'polo' , 'dress') not NULL,
color ENUM('red' , 'blue' , 'orange' , 'white' , 'black'),
owner smallint unsigned NOT NULL REFERENCES person(id),
PRIMARY KEY (id)
);

 -- first insert into person 
 INSERT INTO person VALUES (NULL , 'Antonio Paz');

 SELECT @last := LAST_INSERT_ID();

 --first insert into shirt 
 INSERT INTO shirt VALUES 
 (NULL , 'polo' , 'blue' , @last),
 (NULL , 'dress' , 'red' , @last),
 (NULL , 't-shirt' , 'blue' , @last);


-- second insert into person 
 INSERT INTO person VALUES (NULL , 'Lilliana Angelovska');

 SELECT @last := LAST_INSERT_ID();

 --second insert into shirt
 INSERT INTO shirt VALUES 
 (NULL , 'dress' , 'orange' , @last),
 (NULL , 'polo' , 'red' , @last),
 (NULL , 'dress' , 'blue' , @last),
 (NULL , 't-shirt' , 'white' , @last);
