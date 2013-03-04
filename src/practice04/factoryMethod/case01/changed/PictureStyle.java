package practice04.factoryMethod.case01.changed;

public abstract class PictureStyle {
	
	Brush brush;
	
	public PictureStyle() {
		this.brush = createBrush();
	}

	public abstract Brush createBrush();
	public abstract String name();

	public Brush getBrush(){
		return this.brush;
	}
	
	public void draw(){
		brush.drawCircle();
		brush.drawLine();
	}

}
