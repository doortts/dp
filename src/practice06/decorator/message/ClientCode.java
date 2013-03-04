package practice06.decorator.message;

public class ClientCode {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //1. 기본 메시지 생성
        MessageCreator dc1 = new DefaultMessageCreator();
        System.out.println("1. 기본 메시지 생성");
        System.out.println(dc1.createMessage());

        //2. 시간 추가 메시지 생성
        MessageDecorator tc2 = new TimeAddedMessageCreator();
        MessageCreator dc2 = new DefaultMessageCreator();
        tc2.setComponent( dc2 );
        System.out.println("2. 시간 추가 메시지 생성");
        System.out.println(tc2.createMessage());

        //3. 시간 추가 + Html 메시지 생성
        MessageDecorator tc3 = new TimeAddedMessageCreator();
        MessageDecorator hc3 = new HtmlMessageCreator();
        MessageCreator dc3 = new DefaultMessageCreator();
        hc3.setComponent( dc3 );
        tc3.setComponent( hc3 );
        System.out.println("3. 시간 추가 + Html 메시지 생성");
        System.out.println(tc3.createMessage());
    }

}
