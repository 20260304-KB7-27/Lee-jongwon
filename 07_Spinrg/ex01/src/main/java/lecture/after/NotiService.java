package lecture.after;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 서비스 로직
@Service
public class NotiService {
    @Autowired
    public NotiService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    private final EmailSender emailSender;

    public void notify(String message){
        emailSender.send(message);

    }
}
