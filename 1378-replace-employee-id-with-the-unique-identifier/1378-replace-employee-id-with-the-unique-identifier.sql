# Write your MySQL query statement below
SELECT ee.unique_id as unique_id , e.name
 from Employees e 
LEFT JOIN EmployeeUNI ee USING(id) ;