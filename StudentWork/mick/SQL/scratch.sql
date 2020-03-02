

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










