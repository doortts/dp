package practice05.decorator.changed;

public class IceDecoration extends Decoration {

	public IceDecoration(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getName() {
		return "Iced " + coffee.getName();
	}

	@Override
	public int getPrice() {
		return coffee.getPrice() + 500;
	}

}
