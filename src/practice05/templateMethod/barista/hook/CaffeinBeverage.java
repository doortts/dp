package practice05.templateMethod.barista.hook;

public abstract class CaffeinBeverage {
	
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	protected abstract void brew();
	protected abstract void addCondiments();

	protected void boilWater() {
		System.out.println("물 끓이고 있음");
	}

	protected void pourInCup() {
		System.out.println("컵에 따르고 있음");
	}
	
	// hook : 추상 클래스에서 선언되는 메소드긴 하지만 기본적인 내용만 구현되어 있거나
	//        아무 코드도 들어있지 않은 메소드. 다양한 위치에서 알고리즘에 끼어들거나 무시하고 넘어갈 수 있음
	protected boolean customerWantsCondiments() {
		return true;
	}
}