SELECT MAX(article) AS article FROM shop;
-- above query would result in -----
                                    |
                                    |
+---------+                         |
| article |                         |
+---------+     <<------------------|
|       4 |
+---------+

-- /////////////// second question \\\\\\\\\\\\\\\\\\\ --

SELECT article, dealer, price  FROM shop
WHERE price=(SELECT MAX(price) FROM shop);
-- above query would result in -----------------
                                                |                           
                                                |                       
+---------+--------+-------+                    |                                                     
| article | dealer | price |                    |                                                     
+---------+--------+-------+ <<-----------------|                      
|    0004 | D      | 19.95 |                              
+---------+--------+-------+                                


-- /////////////// Third question \\\\\\\\\\\\\\\\\\\ --
SELECT article, dealer, price  FROM shop
ORDER BY price DESC  LIMIT 1;
-- above query would result in ----------------------                                                                                                          
                                                    |
                                                    |
                                                    |
+---------+--------+-------+                        |                      
| article | dealer | price |                        |                      
+---------+--------+-------+   <<-------------------|                      
|    0004 | D      | 19.95 |                            
+---------+--------+-------+   


-- /////////////// Fourth question \\\\\\\\\\\\\\\\\\\ --
SELECT article, MAX(price) AS price  FROM shop
GROUP BY article;
-- above query would result in ----------------------                                                                                                          
                                                    |
                                                    |
                                                    |
| article | price |                                 |
+---------+-------+                                 |
|    0001 |  3.99 |                                 |
|    0002 | 10.99 |                                 |
|    0003 |  1.69 |   <<----------------------------|
|    0004 | 19.95 |                     
+---------+-------+      

-- /////////////// Fifth question \\\\\\\\\\\\\\\\\\\ --
SELECT article, dealer, price  
FROM shop s1
WHERE price=(SELECT MAX(s2.price)
FROM shop s2
WHERE s1.article = s2.article); 
-- above query would result in ----------------------                                                                                                          
                                                    |
                                                    |
                                                    |
                                                    |
                                                    |
| article | dealer | price |                        |
+---------+--------+-------+                        |
|    0001 | B      |  3.99 |                        |
|    0002 | A      | 10.99 | <<---------------------|
|    0003 | C      |  1.69 |
|    0004 | D      | 19.95 |
+---------+--------+-------+
