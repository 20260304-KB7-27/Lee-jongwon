/*
safe mode
- 한번의 쿼리 실수로 모든 데이터가 수정되거나 삭제되는 것을 방지하기 위해
- 조건문이 없을때 update, delete가 동작하지 않게 막는 기능
*/

use sqldb;

set sql_safe_updates = 0; -- mysql safe 모드 끄기

update buytbl
set price = price * 1.5; -- 모든 가격 1.5배

set sql_safe_updates = 1; -- mysql safe 모드 켜기

use testdb;

DROP TABLE IF EXISTS board;

CREATE TABLE board (
                       post_no    INT          NOT NULL AUTO_INCREMENT,
                       title      VARCHAR(100) NOT NULL,
                       author     VARCHAR(50)  NOT NULL,
                       PRIMARY KEY (post_no)
);

INSERT INTO board (title, author) VALUES ('첫 번째 글', '홍길동');
INSERT INTO board (title, author) VALUES ('두 번째 글', '김철수');
INSERT INTO board (title, author) VALUES ('세 번째 글', '이영희');
INSERT INTO board (title, author) VALUES ('네 번째 글', '박민준');
INSERT INTO board (title, author) VALUES ('다섯 번째 글', '최지수');

/*
delete
- 테이블의 행(row)를 삭제하는 DML명령어
- WHERE 조건으로 특정 행을 삭제 할 수 있다.
- 트랜잭션(롤백)으로 복구 가능
*/

delete from board
where post_no = 5;

select * from board;

-- auto increment 값이 초기화 되지 않고 이어서 증가함
INSERT INTO board (title, author) VALUES ('여섯 번째 글', '최지수');

/*
TRUNCATE
- 테이블의 전체 행을 한번에 삭제하는 DDL명령어
- where 사용 불가(전체 삭제 전용)
- 트랜잭션(롤백) 불가
- delete 보다 처리 속도가 빠름
- 테이블 구조(컬럼, 제약조건) 유지, auto_increment는 초기화
*/

TRUNCATE table board;

INSERT INTO board (title, author) VALUES ('첫 번째 글', '홍길동');

/*
drop
- 테이블 자체를 데이터베이스에서 완전히 제거하는 DDL명령어
- 트랜잭션(롤백) 불가
*/

-- 테이블이 없으면 에러발생
drop table board;

-- 일반적으로는 if exists를 붙여서 사용
drop table if exists board;




