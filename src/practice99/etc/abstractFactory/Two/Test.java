package practice99.etc.abstractFactory.Two;


class Test {
	public static void main(String args[]) {
		WidgetFactory factory = new PMWidgetFactory();
		
		ScrollBar sb = factory.createScrollBar();
		Button bt = factory.createButton();
		
		System.out.println(sb.getName());
		System.out.println(bt.getName());
	}
}
