-- 조건/흐름 내장함수

use employees;

/*
if(condition, true_value, false_value)
- condition이 true이면 true_value 반환
- condition이 false이면 false_value 반환
*/

select
    emp_no,
    first_name,
    gender,
    if(gender = 'M', '남성', '여성') as 성별_한글
from employees
limit 10;

/*
case when condition then result ... else result end
- 여러 조건을 순서대로 검색해서 처음으로 참인 조건의 결과를 반환
*/
-- 급여 구간에 따른 등급 구분
select
    emp_no,
    salary,
    case
        when salary >= 100000 then 'S등급'
        when salary >= 80000 then 'A등급'
        when salary >= 50000 then 'B등급'
        else 'C등급'
    end as 급여등급
from salaries
where to_date = '9999-01-01'
limit 10;

/*
ifnull(column, default_value)
- column의 값이 null이면 dafault_value를 반환하고, null이 아니면 원래 값을 반환
*/
use sqldb;

select
    name,
    mobile1,
    mobile2,
    ifnull(
        concat(mobile1, '-', mobile2),
        '번호없음'
    )as 전화번호
from usertbl;
