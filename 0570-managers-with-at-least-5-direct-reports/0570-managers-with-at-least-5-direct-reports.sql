# Write your MySQL query statement below
Select m.name 
FROM employee e
JOIN Employee m
ON e.managerID = m.id
GROUP BY m.id, m.name
HAVING COUNT(*) >= 5
