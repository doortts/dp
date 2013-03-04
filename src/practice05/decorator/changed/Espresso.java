package practice05.decorator.changed;

public class Espresso extends Coffee {

	@Override
	public String getName() {
		return "Espresso";
	}

	@Override
	public int getPrice() {
		return 3500;
	}

}
