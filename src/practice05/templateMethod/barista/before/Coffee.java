package practice05.templateMethod.barista.before;

public class Coffee {
	
	public void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	public void boilWater() {
		System.out.println("물 끓이고 있음");
	}

	public void brewCoffeeGrinds() {
		System.out.println("필터로 커피를 우려내고 있음");
	}

	public void pourInCup() {
		System.out.println("컵에 따르고 있음");
	}

	public void addSugarAndMilk() {
		System.out.println("설탕과 우유 추가하고 있음");
	}
}
