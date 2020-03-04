SELECT s.*
FROM person p INNER JOIN shirt s ON s.owner =  p.id
WHERE p.name LIKE '%Lilliana%' AND s.color <>  'white';
-- above query would result in -------------------------
                                            |
                                            |
                                            |
                                            |
+----+-------+--------+-------+             |
| id | style | color  | owner |             |
+----+-------+--------+-------+             |
|  4 | dress | orange |     2 | <<----------|
|  5 | polo  | red    |     2 |
|  6 | dress | blue   |     2 |
+----+-------+--------+-------+
