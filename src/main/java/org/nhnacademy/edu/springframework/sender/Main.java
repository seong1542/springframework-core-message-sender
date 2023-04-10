package org.nhnacademy.edu.springframework.sender;

public class Main {
    public static void main(String[] args) {
        SmsMessageSender smsMessageSender = new SmsMessageSender();
        MessageSendService messageSendService = new MessageSendService(smsMessageSender);
        messageSendService.doSendMessage();
    }
}
