package ch12.sec03.exam03;

public class Application {
    public static void main(String[] args) {

        Member m = new Member("1", "bear", 20);
        System.out.println(m.age());
        System.out.println(m.name());
        System.out.println(m.toString());
    }
}
