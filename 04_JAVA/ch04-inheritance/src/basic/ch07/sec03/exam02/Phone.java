package basic.ch07.sec03.exam02;

public class Phone {
    public String model;
    public String color;

    //기본생성자 생성안됨
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("부모 모든필드를 초기화하는 생성자 호출됨...");
    }

    public Phone(){
        System.out.println("부모 기본 생성자 호출됨...");
    }

    // 메서드
    public void printModel() {
        System.out.println("부모 Phone에서 호출됨 model = " + model);
    }


}
