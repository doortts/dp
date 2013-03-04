package practice01.basic.mobile;

public class ClientCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("===== Car Report =====");
		reportMobile( new Car() );

		System.out.println("===== Airplane Report =====");
		reportMobile( new Airplane() );

	}

	public static void reportMobile(Mobile mobile){
		System.out.println( "It can move? " + mobile.move() );
		System.out.println( "What contains? " + mobile.contains() );
		System.out.println("Can it move over the water? : " + mobile.canMoveOverWater() );
	}
	
}
