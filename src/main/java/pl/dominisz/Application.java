package pl.dominisz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService() {
        if (true) {
            return new WorldMessageService();
        } else {
            return new PolandMessageService();
        }
    }

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        System.out.println("ApplicationContext created");
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
