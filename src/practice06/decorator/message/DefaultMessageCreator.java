package practice06.decorator.message;

public class DefaultMessageCreator implements MessageCreator {

    @Override
    public String createMessage() {
        return "Message";
    }

}
