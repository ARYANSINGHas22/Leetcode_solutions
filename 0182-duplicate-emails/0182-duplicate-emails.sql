# Write your MySQL query statement below
Select email FROM Person
GROUP BY email
Having count(*) > 1