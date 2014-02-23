package practice04.templateMethod.barista.changed;

public class Coffee extends CaffeinBeverage {
	
	@Override
	protected void brew() {
		System.out.println("필터로 커피를 우려내고 있음");
	}

	@Override
	protected void addCondiments() {
		System.out.println("설탕과 우유 추가하고 있음");
	}
}
