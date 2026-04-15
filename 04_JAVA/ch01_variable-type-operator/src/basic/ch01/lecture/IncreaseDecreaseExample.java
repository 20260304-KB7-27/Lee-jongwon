package basic.ch01.lecture;

public class IncreaseDecreaseExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        // 증감 연산자 예제
        // x = x + 1
//        x++;    // 후위 증가: x = 11
//        ++x;    // 전위 증가: x = 12
        System.out.println("x=" + x++);    // 12 출력
        System.out.println("x=" + x);    // 12 출력
        
        //-128 ~ 127까지의 숫자를 표현
        byte bnum = 127;

        // overflow
        // 자료형별 값의 최대 범위를 벗어나는 경우
        // sign bit를 반전시켜 최소값으로 순환시킴
        System.out.println("bnum = " + bnum++);
        System.out.println("bnum = " + bnum);
    }
}