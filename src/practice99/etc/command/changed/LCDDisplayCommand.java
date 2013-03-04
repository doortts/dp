package practice99.etc.command.changed;

public class LCDDisplayCommand implements SwitchCommnad {

	private LCDDisplay display;
	
	public LCDDisplayCommand(LCDDisplay display) {
		this.display = display;
	}
	
	@Override
	public void off() {
		display.switchOff();
	}

	@Override
	public void on() {
		display.switchOn();
	}

}
