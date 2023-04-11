package org.nhnacademy.edu.springframework.sender;

import org.nhnacademy.edu.springframework.messagesender.User;

public interface MessageSender {
    void sendMessage(User user, String message);

}
