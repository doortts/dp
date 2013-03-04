package practice06.decorator.message;

public abstract class MessageDecorator implements MessageCreator {
    
    protected MessageCreator component;
    
//    public MessageDecorator(MessageCreator messageCreator) {
//        this.component = messageCreator;
//    }

    public void setComponent(MessageCreator component) {
        this.component = component;
    }
}
