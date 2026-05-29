package lecture.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("hello", "world", "stream", "css", "java"));

        stringList.stream()
                .forEach(s -> {
                    System.out.println(s + " : " + Thread.currentThread().getName());
                });

        System.out.println("======================병렬처리=======================");
        // 병렬 스트림
        stringList.parallelStream()
                .forEach(s -> {
                    System.out.println(s + " : " + Thread.currentThread().getName());
                });
    }
}
