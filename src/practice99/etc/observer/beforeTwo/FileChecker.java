package practice99.etc.observer.beforeTwo;

public class FileChecker {

	private int pollingTime = 10; 

	public void update(int pollingTime) {
		this.pollingTime = pollingTime;
	}
	
	public void out(){
		System.out.println("File check polling time : " + this.pollingTime );
	}

}
