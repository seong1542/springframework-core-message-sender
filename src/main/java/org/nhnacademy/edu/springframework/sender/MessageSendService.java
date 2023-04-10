package org.nhnacademy.edu.springframework.sender;

import org.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
    MessageSender messageSender;
    public MessageSendService(MessageSender messageSender){
        this.messageSender= messageSender;
    }

    public void doSendMessage(){
        User user = new User("seong1542@gmail.com", "01088590543");
        messageSender.sendMessage(user,"message");
    }
}
