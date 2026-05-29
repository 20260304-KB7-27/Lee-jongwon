package lecture.section02.intermidate;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        /*
         * flatMap -> 중첩된 구조를 한단계 제거하고 단일 컬렉션으로 만든다
         *
         * */

        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                Arrays.asList("java", "spring", "springboot")

        );

        System.out.println(list);

        List<String> strList = list.stream()
                .flatMap(Collection::stream) //컬렉션 -> stream -> toList
                .toList();
        System.out.println(strList);
    }
}