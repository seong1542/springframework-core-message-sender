package org.nhnacademy.edu.springframework.sender;

import org.aspectj.lang.annotation.Aspect;
import org.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class MessageSendService {
    @Value("${name}")
    private String name;
    private MessageSender messageSender;

    @Autowired
    public MessageSendService(@Qualifier("smsMessageSender") MessageSender messageSender){
        this.messageSender= messageSender;
    }


    public void doSendMessage(){
        User user = new User("seong1542@gmail.com", "01088590543");
        messageSender.sendMessage(user,"MessageSenderService"+name);

    }

    @PostConstruct
    public void init(){
        System.out.println("------init");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("------destroy");
    }
}
