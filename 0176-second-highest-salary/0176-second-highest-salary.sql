
#Direct SELECT ... FROM ... WHERE ... → empty set if no matches.
#Scalar subquery SELECT (SELECT ... ) → returns one row with NULL if no matches.
#This is why the “nested in SELECT” trick is so popular for these “Nth highest” problems.

-- select(
--     select Distinct salary from employee order by salary desc limit 1 offset 1
-- )As SecondHighestSalary;

#or

select max(salary) as SecondHighestSalary from Employee where salary<(select max(salary) from Employee);

