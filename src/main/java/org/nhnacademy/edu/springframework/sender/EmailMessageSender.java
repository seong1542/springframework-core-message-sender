package org.nhnacademy.edu.springframework.sender;

import org.aspectj.lang.annotation.Aspect;
import org.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype") // 프로토타입으로 설정해주면 로드될때 생성되지 않음. 지정하지 않으면 singleton으로 설정되어서 먼저 생성된다.
public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Messanger sent to  "+user.getEmail()+message);
    }

    public EmailMessageSender(){//객체 생성하고 postbefore하고 init, postafter
        System.out.println("email");
    }

}
