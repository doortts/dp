package practice06.decorator.changed;

public abstract class Decoration extends Coffee {

	protected Coffee coffee;

	public Decoration(Coffee coffee ) {
		this.coffee = coffee;
	}
}
