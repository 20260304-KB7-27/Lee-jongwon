package basic.ch07.sec08.exam02;

public class Application {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Vehicle vehicle = new Vehicle();
        Bus bus = new Bus();

        //동적 바인딩
        //매개변수 타입은 Vehicle이지만
        //실제 전달되는 객체에 따라 실행 메소드가 달라짐
        driver.drive(bus);
    }
}
