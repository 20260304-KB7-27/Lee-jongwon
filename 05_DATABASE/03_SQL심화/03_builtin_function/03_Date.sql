-- 날짜 내장함수

use employees;

select
    emp_no
from employees
limit 10;

select
    emp_no,
    hire_date,
    year(hire_date),
    month(hire_date),
    day(hire_date)
from employees
limit 10;

/*
datediff(date1, date2)
- date1에서 date2를 뺀 일수 차이를 구함
*/

select
    emp_no,
    hire_date,
    DATEDIFF(curdate(), hire_date)
from employees
limit 10;

/*
date_format(date, format)
- %Y : 4자리 년도, %m : 2자리 월, %d : 2자리 요일
- %y : 2자리 년도, %M : 영문 월 이름, %D : 영문 요일 이름
*/
select
    emp_no,
    hire_date,
    DATE_FORMAT(hire_date, '%Y년 %m일 %d일')
from employees
limit 10;

