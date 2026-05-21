-- 계정 만들기
create user 'jjong'@'%' identified by "jong";

show tables;

select user, user.host from user;


-- 권한 부여
-- employee 데이터 베이스에 대한 모든 권한 부여
GRANT ALL PRIVILEGES ON employees.* TO 'jjong'@'%';

-- 'jjong'@'%'가 가진 모든 권한 조회
show grants for 'jjong'@'%'
