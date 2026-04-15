package basic.ch04;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {

        //while(조건) {반복시킬 코드}
        Scanner scanner = new Scanner(System.in); // 키보드와 Scanner 연결

        boolean run = false;
        int speed = 0;

//        while(run) {
//            System.out.println("1. 중속 | 2. 감속 | 3. 중지");
//            System.out.println("선택 : ");
//            String strNum = scanner.nextLine(); // 키보드에서 입력한 내용을 읽음
//
//            if(strNum.equals("1")) {
//                speed++;
//                System.out.println("현재 속도 : " + speed);
//            }else if(strNum.equals("2")) {
//                speed--;
//                System.out.println("현재 속도 : " + speed);
//            }else {
//                run = false; // while문의 조건을 false로
//            }
//        }
        
        // do while
        //일단 1번은 무저건 실행 이후에 조건확인
        
        do {
            while(run) {
                System.out.println("1. 중속 | 2. 감속 | 3. 중지");
                System.out.println("선택 : ");
                String strNum = scanner.nextLine(); // 키보드에서 입력한 내용을 읽음

                if(strNum.equals("1")) {
                    speed++;
                    System.out.println("현재 속도 : " + speed);
                }else if(strNum.equals("2")) {
                    speed--;
                    System.out.println("현재 속도 : " + speed);
                }else {
                    run = false; // while문의 조건을 false로
                }
            }
        }while(run);

        System.out.println("종료");
    }
}
