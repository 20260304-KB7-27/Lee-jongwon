package lecture.section;

import java.util.List;
import java.util.Optional;

public class UserService {

    // Repository 주입
    private final UserRepository repository = new UserRepository();

    public List<User> getUsers() {
        //비지니스 로직 들어올 자리
        List<User> users = repository.findAll();

        return users;
    }

    public User getUsersById(long l) {

        //Optional<User>
        User user = repository.findById(l)
                .orElseThrow(() -> new RuntimeException("존재하지않는 유저입니다. id = " + l));
        return user;
    }

    //ifPresent -> 값이 없으면 실행
    public void printIfExist(long l) {

        //Optional<User>
        //없을때 예외를 던짐
        repository.findById(l)
                .ifPresent( u -> System.out.println("user = " + u));
    }

    public String getEmail(long l){
        return repository.findById(l)
                // findById -> Optional<User> -> getEmail -> Optional<Optional<String>>
                // 일반적인 getEmail을 하게되면 Optional이 중복으로 감싸짐
                // flatMap을 이용해서 Optional 하나로 처리
                .flatMap(user -> Optional.ofNullable(user.getEmail()))
                .orElse("이메일 없음");
    }
}
