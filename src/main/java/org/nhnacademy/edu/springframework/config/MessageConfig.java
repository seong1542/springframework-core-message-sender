package org.nhnacademy.edu.springframework.config;

import org.nhnacademy.edu.springframework.sender.MessageSender;
import org.nhnacademy.edu.springframework.sender.SmsMessageSender;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.nhnacademy.edu.springframework.sender")
@PropertySource("classpath:name.properties")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MessageConfig {

}
