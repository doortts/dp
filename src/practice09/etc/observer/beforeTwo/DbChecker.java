package practice09.etc.observer.beforeTwo;

public class DbChecker {

	private int pollingTime = 10; 
	
	public void update(int pollingTime) {
		this.pollingTime = pollingTime;
	}
	
	public void out(){
		System.out.println("DB check polling time : " + this.pollingTime );
	}

}
