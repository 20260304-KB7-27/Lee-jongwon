package advanced.ch18.sec10;

import java.io.Serializable;
/*
* Serializable
* - 객체를 직렬화 할 수 있도록 표시하는 인터페이스
* - 마커 인터페이스 (내부 메서드 없음 표시 역할만 함)
 */

public class Member implements Serializable {

    /*
    * serialVersionUID
    * 직렬화 클래스의 버전 식별용
     */
    private static final long serialVersionUID = 2L;

    private String name;
    private int age;

    //직렬화 제외대상 지정 키워드 transient
    private transient String password;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }

    public Member(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}
