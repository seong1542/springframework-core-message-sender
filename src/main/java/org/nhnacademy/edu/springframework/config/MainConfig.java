package org.nhnacademy.edu.springframework.config;

import org.nhnacademy.edu.springframework.sender.EmailMessageSender;
import org.nhnacademy.edu.springframework.sender.MessageSendService;
import org.nhnacademy.edu.springframework.sender.MessageSender;
import org.nhnacademy.edu.springframework.sender.SmsMessageSender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class MainConfig {

    @Bean
    public MessageSender smsMessageSender(){
        return new SmsMessageSender();
    }

    @Bean
    public MessageSender emailMessageSender(){
        return new EmailMessageSender();
    }

    @Bean
    public MessageSendService messageSendService(){
        return new MessageSendService(emailMessageSender());
    }
}
