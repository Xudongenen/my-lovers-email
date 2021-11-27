package com.td.mylovers;
import com.td.mylovers.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

@SpringBootTest
public class testEmailService{

    @Resource
    EmailService emailService;

    @Test
    public void sendEmail() {
        String[] loverEmailList = new String[]{
                "XXXXXXX@tju.edu.cn",
                "XXXXXXX@tju.edu.cn",
                "XXXXXXX@tju.edu.cn",
                "XXXXXXX@tju.edu.cn",
                "XXXXXXX@tju.edu.cn",
                "XXXXXXX@tju.edu.cn",
                "XXXXXXX@tju.edu.cn",
                "XXXXXXX@tju.edu.cn",
                "XXXXXXX@tju.edu.cn",
        };
        for (String emailAddr:loverEmailList)
            emailService.sendMail(emailAddr,"滚！","xx");
    }
}
