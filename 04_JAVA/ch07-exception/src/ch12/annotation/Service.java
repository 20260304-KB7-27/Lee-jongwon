package ch12.annotation;

public class Service {

    @PrintAnnotation // 둘다 기본 값
    public void method1() {
        System.out.println("실행 내용 1");
    }

    @PrintAnnotation("*") //value = "*" number는 기본값
    public void method2() {
        System.out.println("실행 내용 1");
    }

    @PrintAnnotation(value = "*", number = 20) //value = "*" number = 20
    public void method3() {
        System.out.println("실행 내용 1");
    }
}
