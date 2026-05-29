package lecture.section02.terminate;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {

        // IntStream -> 연산 sum, count
        // 최대, 최소, 총합, 평균..
        long count = IntStream.range(1, 10).count();
        System.out.println("count = " + count);

        //OptionalInt
        //max값이 없을 수 있기 떄문에 OptionalInt 사용
        OptionalInt max = IntStream.range(1, 10).max();
    }
}
