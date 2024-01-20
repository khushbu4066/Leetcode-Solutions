SELECT 
name
FROM 
Customer
WHERE 
#referee_id is NULL OR referee_id != 2

IFNULL(referee_id,0)<>2  
# Another way to write the query using function IFNULL and <> means != 
