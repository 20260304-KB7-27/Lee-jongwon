package lecture.section;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        //주입
        UserService service = new UserService();

        // 전체 조회
        List<User> users = service.getUsers();
        //users.forEach(u -> System.out.println(users));

        //단일 조회
        User user = service.getUsersById(1L);
        System.out.println(user);

        User user2 = null;
        try {
            user2 = service.getUsersById(99L);
        } catch (Exception e) {
            System.out.println("예외 : " + e.getMessage());
        }
        service.printIfExist(3L);

        /*
        * 이메일
         */
        String email = service.getEmail(1L);
        String email2 = service.getEmail(2L);
        System.out.println(email);
        System.out.println(email2);
    }
}
