package basic.ch07.sec03.exam02;

/*
* 상속
* - 부모가 가지고 있는 멤버(필드링, 메서드)를 자식이 물려받음을 의미
* - 자바에서는 확장의 개념으로 생각
 */

public class SmartPhone extends Phone{

    public String network;

    public SmartPhone() {
        System.out.println("자식의 기본생성자 호출됨...");
    }

    public SmartPhone(String model, String color, String network) {
        super(model, color); // 부모 생성자 호출이 먼저 와야함
        this.network = network;
        System.out.println("자식의 모든 필드를 초기화하는 생성자 호출됨...");
    }

    /*
    * Overriding
    * - 부모가 가지는 메소드 선언부를 그대로 사용하면서
    * - 자식 클래스에서 정의한대로 동작하도록 함
    *
    * 참고
    * - private 메서드는 접근이 불가하기 때문에 불가능
    * - final 메서드도 오버라이딩 불가
    * - 접근제어자가 부모 메서드와 같거나 더 넓어야한다.
     */
    @Override // 컴파일할때 제대로 오버라이딩이 되었는지 체크해줌
    public void printModel() {
        super.printModel();
        System.out.println("자식에서 호출된 printModel...");
    }



}
