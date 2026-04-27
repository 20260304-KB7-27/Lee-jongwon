package basic.ch14.lecture.syncronization;

public class SafeAccount {

    // 공유자원 -> 여러 스레드가 사용할 수 있는 자원
    private int balance = 1000; // 계좌 잔액

    // 출금 메서드
    // synchronized
    // - 특정 코드 영역(임계영역)에 한번에 하나의 스레드만 들어올 수 있도록 막아주는 키워드
    public synchronized void withdraw(int money) {
        if(balance >= money) {
            try {
                Thread.sleep(1000); // 다른 스레드의 개입 가능성을 높이기 위한 지연

            } catch(InterruptedException e) {}
            balance -= money;
            System.out.println("출금 후 잔액 : " + this.balance);
        }
    }
    public int getBalance() {
        return balance;
    }
}
