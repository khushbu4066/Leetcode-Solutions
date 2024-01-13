# Write your MySQL query statement below

SELECT contest_id, ROUND((COUNT(distinct user_id)*100)/(SELECT COUNT(user_id) FROM Users),2) AS percentage
FROM Register 
GROUP BY contest_id
Order by percentage DESC, contest_id