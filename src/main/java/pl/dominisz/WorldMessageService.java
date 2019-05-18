package pl.dominisz;

public class WorldMessageService implements MessageService {

    public WorldMessageService() {
        System.out.println("WorldMessageService created");
    }

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
