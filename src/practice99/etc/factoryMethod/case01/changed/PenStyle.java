package practice99.etc.factoryMethod.case01.changed;

public class PenStyle extends PictureStyle {

	public Brush createBrush() {
		return new PenBrush();
	}

	public String name() {
		return "펜화";
	}

}
