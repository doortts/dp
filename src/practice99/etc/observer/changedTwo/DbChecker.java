package practice99.etc.observer.changedTwo;

import practice99.etc.observer.changedTwo.Observer;

public class DbChecker implements Observer {

	private int pollingTime = 10; 
	private ControlPanel panel;
	
	public DbChecker(ControlPanel panel) {
		this.panel = panel;
	}

	public void update() {
		this.pollingTime = panel.getPollingTime();
	}
	
	public void out(){
		System.out.println("DB check polling time : " + this.pollingTime );
	}
	
	public void setNotifier(ControlPanel panel){
		this.panel = panel;
	}
}
