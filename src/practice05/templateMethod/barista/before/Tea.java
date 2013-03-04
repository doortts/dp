package practice05.templateMethod.barista.before;

public class Tea {
	public void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	public void boilWater() {
		System.out.println("물 끓이고 있음");
	}

	public void steepTeaBag() {
		System.out.println("차를 우려내고 있음");
	}

	public void pourInCup() {
		System.out.println("컵에 따르고 있음");
	}

	public void addLemon() {
		System.out.println("레몬 추가하고 있음");
	}
}
