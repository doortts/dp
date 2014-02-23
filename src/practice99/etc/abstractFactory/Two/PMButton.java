package practice99.etc.abstractFactory.Two;


public class PMButton implements Button {
	private String _name;
	
	public PMButton(String name) {
		_name = name;
	}
	public String getName() {
		return _name;
	}
}
