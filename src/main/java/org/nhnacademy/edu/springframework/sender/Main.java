package org.nhnacademy.edu.springframework.sender;

import org.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
//            System.out.println("---------");
//            new MessageSendService(context.getBean("SmsMessageSender", MessageSender.class));
//            System.out.println("---------");
//            new MessageSendService(context.getBean("SmsMessageSender", MessageSender.class));
//            System.out.println("---------");
//            new MessageSendService(context.getBean("EmailMessageSender", MessageSender.class));
//            System.out.println("---------");
//            new MessageSendService(context.getBean("EmailMessageSender", MessageSender.class));

            MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
            service.doSendMessage();
        }

    }
}
