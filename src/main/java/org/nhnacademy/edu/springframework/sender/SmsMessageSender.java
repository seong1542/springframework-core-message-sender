package org.nhnacademy.edu.springframework.sender;

import org.aspectj.lang.annotation.Aspect;
import org.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;


@Component
public class SmsMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SmsMessage Sent to "+user.getPhoneNumber()+message);
    }
    public SmsMessageSender(){ // 객체생성후 post, init postAfter
        System.out.println("sms생성자");
    }

}
