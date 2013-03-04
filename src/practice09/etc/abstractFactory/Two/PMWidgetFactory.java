package practice09.etc.abstractFactory.Two;


public class PMWidgetFactory implements WidgetFactory {
	public PMWidgetFactory() {
	}
	
	public ScrollBar createScrollBar() {
		return new PMScrollBar("PMScrollBar");
	}
	
	public Button createButton() {
		return new PMButton("PMButton");
	}
}
