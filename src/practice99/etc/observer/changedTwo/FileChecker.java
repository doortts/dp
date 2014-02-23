package practice99.etc.observer.changedTwo;

import practice99.etc.observer.changedTwo.Observer;

public class FileChecker implements Observer {

	private int pollingTime = 10;
	private ControlPanel panel;

	public FileChecker(ControlPanel panel) {
		this.panel = panel;
	}

	public void update() {
		this.pollingTime = panel.getPollingTime();
	}
	
	public void out(){
		System.out.println("File check polling time : " + this.pollingTime );
	}
}
