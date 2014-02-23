package practice99.etc.observer.before;

public class ClientCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 초기화 부
		DbChecker dbChecker = new DbChecker();
		FileChecker fileChecker = new FileChecker();

		// 실행부
		dbChecker.out();
		fileChecker.out();

		System.out.println("\n*** polling time updated ***\n");
		dbChecker.update( 3 );
		fileChecker.update( 3 );
		
		dbChecker.out();
		fileChecker.out();

	}

}
