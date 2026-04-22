package lecture.exam02;

public class Application3 {

    public static void main(String[] args) {

        // 상황.
        // 사용자입력문자열 => 숫자로 치환 => 배열 생성 => 특정 인덱스 출력

        String inputSize = "10";
        int inputIndex = 5;

        try {
            int size = Integer.parseInt(inputSize);
            int[] arr = new int[size];
            System.out.println(arr[inputIndex]);
        } catch (NumberFormatException e) {
            System.out.println("치환 불가");
        } catch (NegativeArraySizeException e) {
            System.out.println("배열 크기 음수 제시 불가");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("부적절한 인덱스 제시");
        }
        //다중 catch 블럭 작성 가능

        try {
            int size = Integer.parseInt(inputSize);
            int[] arr = new int[size];
            System.out.println(arr[inputIndex]);
        } catch (RuntimeException e) {//매개변수 다형성
            System.out.println("치환 불가 또는 음수제시 불가 또는 부적적한 인덱스");
        }
        // 부모 타입 예외 클래스로 한꺼번에 처리 가능

        try {
            int size = Integer.parseInt(inputSize);
            int[] arr = new int[size];
            System.out.println(arr[inputIndex]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("부적절한 인덱스");
        }catch (RuntimeException e) {//매개변수 다형성
            System.out.println("치환 불가 또는 음수제시 불가 또는 부적적한 인덱스");
        }
        //하위 예외클래스 타입 아래에 상위 예외클래스 타입이 있어야한다.(순서 중요)

        System.out.println("프로그램 종료");



    /*
        Unchecked Exception (실행 예외)
        1. 컴파일 에러가 뜨지 않음
        2. 예외 처리 코드가 필수가 아님
            => 즉, 예외 처리 코드를 필수로 작성하지 않아도 프로그램 동작 가능
        3. 예측 가능한 상황 => 조건문으로도 핸들링 가능
        4. RuntimeException 계층
     */
    }
}