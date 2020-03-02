-- Create the following table:

CREATE TABLE person
(
    id SMALLINT
    UNSIGNED NOT NULL AUTO_INCREMENT ,
    name VARCHAR
    (60) NOT NULL,
    PRIMARY KEY
    (id)
);

    CREATE TABLE shirt
    (
        id SMALLINT
        UNSIGNED NOT NULL AUTO_INCREMENT ,
    style ENUM
        ('t-shirt', 'polo', 'dress') NOT NULL,
    color ENUM
        ('red', 'blue', 'orange', 'white', 'black') NOT NULL,
    OWNER SMALLINT UNSIGNED NOT NULL REFERENCES person
        (id),
    PRIMARY KEY
        (id)

);


        -- insert the following values

        INSERT INTO person
        VALUES
            (NULL, 'Antonio Paz');
        SELECT @last
        := LAST_INSERT_ID
        ();
        INSERT INTO shirt
        VALUES
            (NULL, 'polo', 'blue', @last),
            (NULL, 'dress', 'white', @last),
            (NULL, 't-shirt', 'blue', @last);

        INSERT INTO person
        VALUES
            (NULL, 'Lilliana Angelovska');

        SELECT @last
        := LAST_INSERT_ID
        ();
        INSERT INTO shirt
        VALUES
            (NULL, 'dress', 'orange', @last),
            (NULL, 'polo', 'red', @last),
            (NULL, 'dress', 'blue', @last),
            (NULL, 't-shirt', 'white', @last);
        -- Find out person names containing  “Lilliana” as a string and having a shirt  
        -- of any color but not white.
        SELECT s.*
        FROM person p INNER JOIN shirt s ON s.owner =  p.id
        WHERE p.name LIKE '%Lilliana%' AND s.color <>  'white';

-- +----+-------+--------+-------+
-- | id | style | color  | OWNER |
-- +----+-------+--------+-------+
-- |  4 | dress | orange |     2 |
-- |  5 | polo  | red    |     2 |
-- |  6 | dress | blue   |     2 |
-- +----+-------+--------+-------+