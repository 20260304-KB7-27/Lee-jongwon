package lecture.section02.intermidate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(0, 10);

        /*
        * Map
        - 스트림에 들어있는 데이터를 특정 람다식으로 가공하고 새로운 스트림에 반환
         */

        intStream.filter(i -> (i % 2) == 0)
                .peek(i -> System.out.println("중간 확인 : " + i))
                .map(i -> i * 5)
                .forEach(i -> System.out.println(i));
    }
}
