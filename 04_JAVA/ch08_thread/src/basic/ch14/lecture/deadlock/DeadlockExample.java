package basic.ch14.lecture.deadlock;

public class DeadlockExample {

    /*
    * 데드락
    * - 두개 이상의 스레드가 서로 가진 락을 기다리면서 무한정 대기하는 상태
    *
    * 데드락 발생 조건
    * - 상호배제 -> 한번에 하나의 공유자원만 사용가능
    * - 점유대기 -> 하나를 가지고 다른 공유자원을 기다리는
    * - 비선점 -> 강제로 다른 스레드가 점유한 공유자원을 뺏을 수 없는
    * - 순환대기 -> 서로 물려있는 상태
    *
    * 일반적인 락 해제 방법
    * -> 락 획득 순서를 통일(모든 스레드가 티셔츠 -> 바지 순으로 접근 가능하게 설계)
     */

    // 공유자원
    static final Object 티셔츠 = new Object();
    static final Object 바지 = new Object();


    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (티셔츠) {
                    System.out.println("형 : 티셔츠을 입었다. 바지를 입자");

                    try { Thread.sleep(100);} catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } ;
                    System.out.println("형 : 바지찾으러가는중...");

                    synchronized (바지) {
                        System.out.println("형 : 옷다입었다!");
                    }
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (티셔츠) { //바지로 하면 데드락 걸림
                    System.out.println("동생 : 바지을 입었다. 티셔츠ㅓ를 입자");

                    try { Thread.sleep(100);} catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } ;
                    System.out.println("동생 : 티셔츠찾으러가는중...");

                    synchronized (바지) { //티셔츠로 하면 데드락 걸림
                        System.out.println("동생 : 옷다입었다!");
                    }
                }

            }
        });

        t1.start();
        t2.start();
    }
}