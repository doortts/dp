package practice99.etc.command.changed;

public class ClientCode {
	public static void main(String[] args) {
		Light l = new Light();
		LightCommand command = new LightCommand(l);
		
		LCDDisplayCommand displayCommand
		= new LCDDisplayCommand( new LCDDisplay());
		
		Switch s = new Switch(command);
		s.flipUp();
		s.flipDown();
		
		Switch s2 = new Switch(displayCommand);
		s2.flipUp();
		
	}
}
