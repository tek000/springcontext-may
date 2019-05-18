package pl.dominisz;

import org.springframework.stereotype.Component;

@Component
public class EmailService {


    public EmailService() {
        System.out.println("EmailService created");
    }

    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }



}
