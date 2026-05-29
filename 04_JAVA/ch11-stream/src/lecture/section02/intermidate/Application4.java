package lecture.section02.intermidate;

import java.util.List;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {
        List<Integer> integerList = IntStream.of(1,2,3,4,5,13,4)
                .boxed() // IntStream -> Stream<Integer>
                .sorted() // 기본정렬 -> 오름차순
                .toList();

        System.out.println("integerList = " + integerList);
    }
}
