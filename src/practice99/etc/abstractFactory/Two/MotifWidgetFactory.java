package practice99.etc.abstractFactory.Two;


public class MotifWidgetFactory implements WidgetFactory {
	public MotifWidgetFactory() {
	}
	
	public ScrollBar createScrollBar() {
		return new MotifScrollBar("MotifScrollBar");
	}
	
	public Button createButton() {
		return new MotifButton("MotifButton");
	}
}
