package practice99.etc.command.changedTwo;

public class ClientCode {
	public static void main(String[] args) {
		Light light = new Light();
		Command switchUp = new TurnOnLightCommand(light);
		Command switchDown = new TurnOffLightCommand(light);

		Switch s = new Switch(switchUp, switchDown);

		s.flipUp();
		s.flipDown();
		s.flipDown();
		s.flipDown();
		s.undo();
		s.undo();
		s.undo();
		s.undo();
	}
}
