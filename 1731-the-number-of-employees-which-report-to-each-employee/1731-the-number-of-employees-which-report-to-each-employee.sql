# Write your MySQL query statement below

SELECT 
  e1.employee_id,
  e1.name, 
  COUNT(e2.employee_id) AS reports_count, 
  ROUND(AVG(e2.age)) AS average_age
  
FROM 
  Employees e1 INNER JOIN Employees e2
ON 
  e1.employee_id = e2.reports_to
GROUP BY 
  employee_id, name
ORDER BY 
  employee_id