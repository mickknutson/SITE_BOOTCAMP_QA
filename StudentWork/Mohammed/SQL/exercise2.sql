## EXERCIE 2

 -- person TABLE ..
CREATE TABLE person (
id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
name VARCHAR (60) NOT NULL,
PRIMARY KEY (id)
);

-- shirt TABLE .. 
CREATE TABLE shirt (
id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
style ENUM ('t-shirt' , 'polo', 'dress') NOT NULL, 
color ENUM ('red' , 'blue', 'orange' , 'white' ,'black') NOT NULL,
owner SMALLINT UNSIGNED NOT NULL REFERENCES 
person(id),
PRIMARY KEY (id)
);