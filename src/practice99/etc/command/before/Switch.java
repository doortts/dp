package practice99.etc.command.before;

/*the Invoker class*/
public class Switch {
	private Light light;

	public Switch(Light light) {
		this.light = light;
	}

	public void flipUp() {
		light.turnOn();
	}

	public void flipDown() {
		light.turnOff();
	}
}
