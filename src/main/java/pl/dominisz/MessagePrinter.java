package pl.dominisz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    final private MessageService messageService;
    final private EmailService emailService;
    final private DatabaseService databaseService;

    @Autowired
    public MessagePrinter(MessageService messageService, EmailService emailService, DatabaseService databaseService) {
        this.messageService = messageService;
        this.emailService = emailService;
        this.databaseService = databaseService;
        System.out.println("MessagePrinter created");
    }

    public void printMessage() {
        String message = messageService.getMessage();

        System.out.println(this.messageService.getMessage());
        emailService.sendMessage(message);
        databaseService.storeMessage(message);

    }
}
