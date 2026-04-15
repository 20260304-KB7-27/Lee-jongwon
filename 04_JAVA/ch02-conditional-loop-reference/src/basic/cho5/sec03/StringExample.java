package basic.cho5.sec03;

public class StringExample {
    public static void main(String[] args) {
        // String 객체 타입
        String str1 = "hello";

        // 2. String 불변 객체
        // -> 기존 값이 변경되지 않고 새로운 객체가 생성
        String str2 = "hello";
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str3 = new String("hello"); //생성자를 이용하면 새로운 객체를 저장
        System.out.println(System.identityHashCode(str3));

        // 문자열 풀에 있는 같은 주소
        System.out.println(str1 == str3);

        // 문자열을 비교할때는 equals를 사용
        System.out.println(str1.equals(str3));

        str1 = str1 + "world";

        // System.identityHashCode 코드상에서 주소값 보는 메소드
        //System.out.println(System.identityHashCode(str1));



    }
}
