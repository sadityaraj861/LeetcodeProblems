# Write your MySQL query statement below
# left join makes sures the allpart form the left table and the comman in both.
select p.firstName,p.lastName,a.city,a.state from person p LEFT JOIN Address a on p.personId=a.personId;
