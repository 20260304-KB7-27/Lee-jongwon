package lecture.section02.generation;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        /*
        * range(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자들 범위(종료값 전까지)의 스트림을 생성
        * rangeClosed(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자들 범위(종료값 포함)의 스트림을 생성
         */

        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(i -> System.out.print(i + " "));

        System.out.println();
        IntStream intStream2 = IntStream.rangeClosed(5, 10);
        intStream2.forEach(i -> System.out.print(i + " "));

        // doubles(갯수) : 난수를 갯수만큼 스트림을 만들어 반환
        // boxed() : 기본타입 스트림을 박싱하여 Stream<타입>으로 변환

        Stream<Double> doubleStream = new Random().doubles(5).boxed();

        Stream<String> stringStream1 = Stream.of("java", "mysql", "jdbc");
        Stream<String> stringStream2 = Stream.of("html", "css", "js");

        System.out.println();
        stringStream1.forEach(System.out::println);

        //concat을 이용해서 두개의 스트림을 동일타입 스트림으로 합칠 수 있다.
        Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);
        concatStream.forEach(System.out::println);
    }
}
