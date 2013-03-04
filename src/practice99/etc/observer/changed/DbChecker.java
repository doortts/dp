package practice99.etc.observer.changed;

public class DbChecker implements Observer {

	private int pollingTime = 10; 
	public void update(int pollingTime) {
		this.pollingTime = pollingTime;
	}
	
	public void out(){
		System.out.println("DB check polling time : " + this.pollingTime );
	}

}
