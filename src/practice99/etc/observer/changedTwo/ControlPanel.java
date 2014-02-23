package practice99.etc.observer.changedTwo;

public class ControlPanel extends Notifier{
	private int pollingTime = 10;

	public void setPollingTime(int pollingTime) {
		this.pollingTime = pollingTime;
	}

	public int getPollingTime() {
		return pollingTime;
	}
}
