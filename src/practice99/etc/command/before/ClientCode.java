package practice99.etc.command.before;

public class ClientCode {
	public static void main(String[] args) {
		Light l = new Light();
		
		LCDDisplay display = new LCDDisplay();
		
		Switch s = new Switch(l);
		LCDSwitch s2 = new LCDSwitch(display); 

		s.flipUp();
		s.flipDown();
	}
}
