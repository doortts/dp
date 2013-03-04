package practice04.factoryMethod.case01.changed;

public class OilStyle extends PictureStyle {

	public Brush createBrush() {
		return new OilBrush();
	}

	public String name() {
		return "유화";
	}
}
