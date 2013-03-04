package practice04.factoryMethod.case01.before;


public class PenBrush extends Brush{
	public void drawCircle() {
		System.out.println("[펜화 스타일] 원을 그린다.");
	}

	public void drawLine() {
		System.out.println("[펜화 스타일] 선을 그린다.");
	}
}

