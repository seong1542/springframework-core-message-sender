package org.nhnacademy.edu.springframework.sender;

import org.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.nhnacademy.edu.springframework");
        context.getBean("messageSendService", MessageSendService.class).doSendMessage();

    }
}
