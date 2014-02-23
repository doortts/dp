package practice99.etc.command.changed;

public class LightCommand implements SwitchCommnad {

	private Light light;
	
	public LightCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void off() {
		light.turnOff();
	}

	@Override
	public void on() {
		light.turnOn();
	}

}
