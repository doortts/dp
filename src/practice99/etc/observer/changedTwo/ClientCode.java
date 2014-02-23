package practice99.etc.observer.changedTwo;

public class ClientCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 초기화 부
		ControlPanel panel = new ControlPanel();
		DbChecker dbChecker = new DbChecker(panel);
		FileChecker fileChecker = new FileChecker(panel);

		panel.addObserver(dbChecker);
		panel.addObserver(fileChecker);

		// 실행부
		panel.immediateOut();
		
		System.out.println("\n*** polling time updated ***\n");
		panel.setPollingTime(3);
		panel.updatePollingTime();
		panel.immediateOut();
		
		System.out.println("\n*** dbChecker removed ***\n");
		panel.removeObserver( dbChecker );
		
		System.out.println("\n*** polling time updated ***\n");
		panel.setPollingTime(7);
		panel.updatePollingTime();
		panel.immediateOut();

	}

}
