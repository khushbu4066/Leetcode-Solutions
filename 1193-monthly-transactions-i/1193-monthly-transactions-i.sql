
select 
Date_Format(trans_date,'%Y-%m') as month,
country, 
count(id) as trans_count,
sum(CASE when state='approved' then 1 else 0 end) as approved_count,
sum(amount) as trans_total_amount,
sum(CASE when state='approved' then amount else 0 end ) as approved_total_amount 
From Transactions 
group by Year(trans_date),Month(trans_date),country
