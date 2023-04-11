package org.nhnacademy.edu.springframework.sender;

import org.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Messanger sent to  "+user.getEmail()+message);
    }

    public EmailMessageSender(){//객체 생성하고 postbefore하고 init, postafter
        System.out.println("email");
    }

    public void init(){
        System.out.println("-------init");
    }

    public void destroy(){
        System.out.println("destroy method called in EmailMessageSender");
    }
}
