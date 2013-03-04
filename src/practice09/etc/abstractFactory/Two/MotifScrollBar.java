package practice09.etc.abstractFactory.Two;


public class MotifScrollBar implements ScrollBar {
	private String _name;
	
	public MotifScrollBar(String name) {
		_name = name;
	}
	public String getName() {
		return _name;
	}
}
