package practice05.decorator.changed;

public class CaramelDecoration extends Decoration {

	public CaramelDecoration(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getName() {
		return coffee.getName() + ", with Caramel";
	}

	@Override
	public int getPrice() {
		return coffee.getPrice() + 500;
	}

}
