package org.nhnacademy.edu.springframework.sender;

import org.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SmsMessage Sent to"+user.getPhoneNumber()+message);
    }
}
