package practice99.etc.abstractFactory.Two;


public class PMScrollBar implements ScrollBar {
	private String _name;
	
	public PMScrollBar(String name) {
		_name = name;
	}
	public String getName() {
		return _name;
	}
}
