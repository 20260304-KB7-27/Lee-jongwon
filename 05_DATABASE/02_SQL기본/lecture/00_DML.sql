-- DML
-- 데이터의 값을 삽입, 수정, 삭제하는 SQL문

-- INSERT
insert into
    employees

values (2, 20260522, '종원', '이', 'M', 20260304);

select * from employees limit 2;

-- UPDATE
-- 테이블에 기록된 컬럼의 값을 수정하는 구문
update
    employees
set
    last_name = '이',
    first_name = '종원'
where
    last_name = '종원';

-- Delete
-- 테이블 행을 삭제
delete
from employees
where first_name = '종원'

