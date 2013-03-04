package practice09.etc.command.changed;

/*the Invoker class*/
public class Switch {
	private SwitchCommnad command;

	public Switch(SwitchCommnad command) {
		this.command = command;
	}

	public void flipUp() {
		this.command.on();
	}

	public void flipDown() {
		this.command.off();
	}
}
