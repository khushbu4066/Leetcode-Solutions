SELECT ROUND(SUM( case when order_date = customer_pref_delivery_date then 1 else 0 end )/ (SELECT COUNT( DISTINCT customer_id) FROM Delivery) * 100 , 2 ) as immediate_percentage
FROM Delivery
WHERE (customer_id,order_date) IN 
(SELECT customer_id , min(order_date) 
FROM Delivery 
GROUP BY customer_id)