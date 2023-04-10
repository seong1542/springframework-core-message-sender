package org.nhnacademy.edu.springframework.sender;

import org.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Messanger sent to "+user.getEmail()+message);
    }
}
