package lecture.section;

import java.util.List;
import java.util.Optional;

public class UserRepository {
    private static final List<User> DB = List.of(
            new User(1L, "홍길동", "hong@gmail.com"),
            new User(2L, "유관순", null),
            new User(3L, "이순신", "lee@gmail.com"),
            new User(4L, "강감찬", "kang@gmail.com")
    );

    /*쿼리*/
    public List<User> findAll() {return DB;}

    // 단일조회
    public Optional<User> findById(Long id) {

        // 없으면 Optional.empty()
        return DB.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst(); //첫번째로 일치하는 값
    }

}
