package lecture.section02.terminate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application2 {
    public static void main(String[] args) {
        /*
         * collect() : Collectors클래스에 정적메서드 사용 가능 / 컬렉션을 출력으로 받을 수 있다.
         */
        List<Member> memberList = Arrays.asList(
                new Member("test01", "testName01"),
                new Member("test02", "testName02"),
                new Member("test03", "testName03"),
                new Member("user04", "userName04"),
                new Member("user05", "userName05")
        );

        List<String> collect = memberList.stream()
                .map(m -> m.getMemberName())
//                .collect(Collectors.toList());
                .toList();

        String str = memberList.stream()
                .map(Member::getMemberName)
                //구분자 / perfix / suffix
                .collect(Collectors.joining("||", "(", ")"));
        System.out.println("str = " + str);

        /*
        * groupingBy
         */
        Map<String, List<Member>> groupMap =
                memberList.stream()
                        .collect(Collectors.groupingBy(member -> {
                            // 그루핑 기준 정의
                            if (member.getMemberId().startsWith("user")){
                                return "USER";
                            }else {
                                return "TEST";
                            }
                        }));

        System.out.println("groupMap = " + groupMap);

    }
}
