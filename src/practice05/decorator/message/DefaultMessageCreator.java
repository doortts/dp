package practice05.decorator.message;

public class DefaultMessageCreator implements MessageCreator {

    @Override
    public String createMessage() {
        return "Message";
    }

}
