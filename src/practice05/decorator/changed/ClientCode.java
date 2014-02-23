package practice05.decorator.changed;

public class ClientCode {

	/**
	 * 커피 주문
	 */
	public static void main(String[] args) {
		Coffee myCoffee = new VanillaDecoration( 
				new IceDecoration( new Americano() ) );
		
		System.out.println( myCoffee.getName() );
		System.out.println( myCoffee.getPrice() );
	}

}
