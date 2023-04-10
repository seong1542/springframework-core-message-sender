package org.nhnacademy.edu.springframework.messagesender;

public class Main {
    private void sendSmsMessage(User user, String message){
        System.out.println("SMS Message Sent to"+user.phoneNumber+" : "+message);
    }
    private void sendEmailMessage(User user, String message){
        System.out.println("SMS Message Sent "+user.email+" : "+message);
    }
    public static void main(String[] args) {
        Main main = new Main();
        User user = new User("seong1542@gmail.com", "01088590543");
        main.sendEmailMessage(user,"안녕");
        main.sendSmsMessage(user,"안녕");

    }

}