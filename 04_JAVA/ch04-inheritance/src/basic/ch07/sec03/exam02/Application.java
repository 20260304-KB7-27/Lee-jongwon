package basic.ch07.sec03.exam02;

public class Application {
    public static void main(String[] args) {

        //부모 생성자를 먼저 호출하고, 자식 생성자를 호출한다.
        SmartPhone smartPhone = new SmartPhone();
        SmartPhone smartPhone2 = new SmartPhone("갤럭시", "은색", "5G");
        
        //부모의 메서드를 호출
        //상속받은 메서드
        smartPhone2.printModel();//오버라이딩한 함수가 호출됨

        Phone phone3 = new SmartPhone();
    }
}
