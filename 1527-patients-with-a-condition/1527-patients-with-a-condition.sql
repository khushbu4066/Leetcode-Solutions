# Write your MySQL query statement below

SELECT patient_id , patient_name , conditions 
from Patients
WHERE conditions REGEXP '\\bDIAB1'


