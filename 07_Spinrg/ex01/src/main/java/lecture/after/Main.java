package lecture.after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //클래스
        NotiService service = context.getBean(NotiService.class);

        service.notify("회원가입을 축하드립니다.");
    }
}
