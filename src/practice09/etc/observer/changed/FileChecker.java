package practice09.etc.observer.changed;

public class FileChecker implements Observer {

	private int pollingTime = 10; 
	public void update(int pollingTime) {
		this.pollingTime = pollingTime;
	}
	
	public void out(){
		System.out.println("File check polling time : " + this.pollingTime );
	}

}