package pl.dominisz;

public class PolandMessageService implements MessageService {

    public PolandMessageService() {
        System.out.println("PolandMessageService created");
    }

    @Override
    public String getMessage() {
        return "Hello Poland";
    }
}
