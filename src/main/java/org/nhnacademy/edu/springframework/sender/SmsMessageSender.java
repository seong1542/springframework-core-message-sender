package org.nhnacademy.edu.springframework.sender;

import org.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SmsMessage Sent to "+user.getPhoneNumber()+message);
    }
    public SmsMessageSender(){ // 객체생성후 post, init postAfter
        System.out.println("sms생성자");
    }
    public void destroy(){
        System.out.println("destroy method called in SmsMessageSender");
    }
    public void init(){
        System.out.println("smsInit");
    }
}
