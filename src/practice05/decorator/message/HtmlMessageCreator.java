package practice05.decorator.message;

public class HtmlMessageCreator extends MessageDecorator {

    @Override
    public String createMessage() {
        return "[HTML] " + component.createMessage();
    }

}
