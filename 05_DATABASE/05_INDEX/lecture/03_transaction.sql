/*
트랜잭션
- 데이터베이스에서 작업을 하나의 논리적인 작업단위로 묶은 것
*/

select @@autocommit; -- 현재 세션에 자동커밋상태
set autocommit = false; -- autocommit 비활성화

-- 트랜잭션 시작
start transaction;

-- 이후에 동작하는 쿼리들은 하나의 작업 단위로 묶임
use sqldb;

delete from buytbl where num = 3;
delete from buytbl where num = 4;

select * from buytbl -- 현재 트랜잭션 세션 안에서는 삭제된 것으로 보이나 실제 데이터베이스에선 반영 안됨

rollback; -- 트랜잭션 시작 이전 가장 최근의 커밋시점으로 되돌림

commit; -- 커밋을 했으때 데이터베이스에 반영된다

set autocommit = true; -- autocommit 활성화

-- autocommit 모드 원래대로 돌려놓기
select @@autocommit;