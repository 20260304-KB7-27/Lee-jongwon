package basic.ch07.sec08.exam02;

public class Driver {

    //메서드 -> 의존관계

    //개방 페쇠법칙
    //확장에는 열려있고, 수정에는 닫혀있는 구조
    public void drive(Vehicle vehicle) {
        vehicle.run();
    }
}
