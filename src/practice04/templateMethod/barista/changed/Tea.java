package practice04.templateMethod.barista.changed;

public class Tea extends CaffeinBeverage {

	@Override
	protected void brew() {
		System.out.println("차를 우려내고 있음");
	}

	@Override
	protected void addCondiments() {
		System.out.println("레몬 추가하고 있음");
	}
}
