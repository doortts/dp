package practice99.etc.factoryMethod.case01.changed;

public class SumieStyle extends PictureStyle {

	public Brush createBrush() {
		return new SumieBrush();
	}

	public String name() {
		return "수묵화";
	}

}
