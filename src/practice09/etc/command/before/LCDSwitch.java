package practice09.etc.command.before;

/*the Invoker class*/
public class LCDSwitch {
	private LCDDisplay display;

	public LCDSwitch(LCDDisplay display) {
		this.display = display;
	}

	public void flipUp() {
		display.switchOn();
	}

	public void flipDown() {
		display.switchOff();
	}
}
