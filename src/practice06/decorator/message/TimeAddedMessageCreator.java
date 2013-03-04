package practice06.decorator.message;

public class TimeAddedMessageCreator extends MessageDecorator {

    @Override
    public String createMessage() {
        return "[TimeAdded] " + component.createMessage();
    }

}
