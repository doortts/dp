package practice99.etc.abstractFactory.Two;


public class MotifButton implements Button {
	private String _name;
	
	public MotifButton(String name) {
		_name = name;
	}
	public String getName() {
		return _name;
	}
}
