package practice06.decorator.changed;

public class VanillaDecoration extends Decoration {

	public VanillaDecoration(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getName() {
		return coffee.getName() + ", with Vanilla";
	}

	@Override
	public int getPrice() {
		return coffee.getPrice() + 500;
	}

}
