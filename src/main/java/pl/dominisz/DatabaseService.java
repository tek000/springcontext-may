package pl.dominisz;

import org.springframework.stereotype.Component;

@Component
public class DatabaseService {

    public DatabaseService() {
        System.out.println("DatabaseService created");
    }

    public void storeMessage(String message) {
        System.out.println("Storing message: " + message);

    }
}
