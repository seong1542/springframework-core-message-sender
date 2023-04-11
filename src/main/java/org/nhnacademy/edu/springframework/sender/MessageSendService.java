package org.nhnacademy.edu.springframework.sender;

import org.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSendService {
    private MessageSender messageSender;

    @Autowired
    public MessageSendService(@MessageQualifier MessageSender messageSender){
        this.messageSender= messageSender;
    }

    public void doSendMessage(){
        User user = new User("seong1542@gmail.com", "01088590543");
        messageSender.sendMessage(user,"MessageSenderService");

    }
}
