package ch12.sec03.exam03;

public record Member(String id, String name, int age) {

    /*
    * record 컴파일러가 자동으로 생성해준다. (DTO 만들때 사용)
    *
    * private final 필드
    * 모든 필드를 받은 생성자
    * getter() => 필드명으로 생성
    * toString() =>
    * hashCode()
    * equals()
     */

}
