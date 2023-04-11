package org.nhnacademy.edu.springframework.sender;

import org.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSendService {
//    private final MessageSender smsMessage; //
//    private final MessageSender emailMessageSender;

    private MessageSender messageSender;

    @Autowired
    public MessageSendService(@MessageQualifier MessageSender messageSender){
        this.messageSender= messageSender;
    }

//    public MessageSendService(MessageSender smsMessageSender, MessageSender emailMessageSender){ // beans
//        this.smsMessage = smsMessageSender;
//        this.emailMessageSender = emailMessageSender;}
//
//    public void setSmsMessageSender(MessageSender messageSender){
//        this.messageSender = messageSender;
//        System.out.println("setSMS invoke");
//    }
//    public void setEmailMessageSender(MessageSender messageSender){
//        this.messageSender = messageSender;
//        System.out.println("setSMS invoke");
//    }

    public void doSendMessage(){
        User user = new User("seong1542@gmail.com", "01088590543");
        messageSender.sendMessage(user,"sms");

    }
}
