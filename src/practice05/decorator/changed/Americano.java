package practice05.decorator.changed;

public class Americano extends Coffee {

	@Override
	public String getName() {
		return "Americano";
	}

	@Override
	public int getPrice() {
		return 3000;
	}

}
