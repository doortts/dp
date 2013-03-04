package practice04.templateMethod.barista.changed;

public abstract class CaffeinBeverage {
	
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	protected abstract void brew();
	protected abstract void addCondiments();

	protected void boilWater() {
		System.out.println("물 끓이고 있음");
	}

	protected void pourInCup() {
		System.out.println("컵에 따르고 있음");
	}
}