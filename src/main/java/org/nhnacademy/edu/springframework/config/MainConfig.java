package org.nhnacademy.edu.springframework.config;

import org.nhnacademy.edu.springframework.sender.EmailMessageSender;
import org.nhnacademy.edu.springframework.sender.MessageSendService;
import org.nhnacademy.edu.springframework.sender.MessageSender;
import org.nhnacademy.edu.springframework.sender.SmsMessageSender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig {

    @Bean(initMethod = "init",destroyMethod = "cleanup")
    public MessageSender smsMessageSender(){
        return new SmsMessageSender();
    }

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public MessageSender emailMessageSender(){
        return new EmailMessageSender();
    }

//    @Bean
//    public MessageSendService messageSendService(@Qualifier("emailMessageSender") MessageSender messageSender){
//        return new MessageSendService(messageSender);
//    }

//    @Bean
//    public MessageSendService messageSendService(MessageSender emailMessageSender){
//        return new MessageSendService(emailMessageSender);
//    }
    @Bean
    public MessageSendService messageSendService(){
        return new MessageSendService(emailMessageSender());
    }
}
