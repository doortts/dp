package practice99.etc.observer.changed;

public class ClientCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 초기화 부
		Notifier notifier = new Notifier();

		DbChecker dbChecker = new DbChecker();
		FileChecker fileChecker = new FileChecker();

		notifier.addObserver(dbChecker);
		notifier.addObserver(fileChecker);

		// 실행부
		notifier.immediateOut();
		
		System.out.println("\n*** polling time updated ***\n");
		notifier.updatePollingTime( 3 );
		notifier.immediateOut();
		
		System.out.println("\n*** dbChecker removed ***\n");
		notifier.removeObserver( dbChecker );
		
		System.out.println("\n*** polling time updated ***\n");
		notifier.updatePollingTime( 5 );
		notifier.immediateOut();

	}

}
