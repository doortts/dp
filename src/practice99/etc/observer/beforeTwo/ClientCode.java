package practice99.etc.observer.beforeTwo;

public class ClientCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		// 초기화 부
		ControlPanel controlPanel = new ControlPanel();
		DbChecker dbChecker = new DbChecker();
		FileChecker fileChecker = new FileChecker();
		
		// 실행부
		dbChecker.out();
		fileChecker.out();
		
		System.out.println("\n*** polling time updated ***\n");
		controlPanel.setPollingTime(3);
		dbChecker.update( controlPanel.getPollingTime() );
		fileChecker.update( controlPanel.getPollingTime() );
		
		dbChecker.out();
		fileChecker.out();

	}

}
