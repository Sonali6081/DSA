# Write your MySQL query statement below
select m.employee_id, m.name, count(r.employee_id) as reports_count, 
round(avg(r.age)) as average_age 
from Employees m
join Employees r on m.employee_id = r.reports_to
group by  m.employee_id, m.name

order by m.employee_id;