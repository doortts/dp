package practice04.templateMethod.item.changed;

public class Socks extends Item {

	public Socks(int unitPrice, int quantity) {
		super(unitPrice, quantity);
	}

	@Override
	public String getName() {
		return "BYC양말";
	}

	@Override
	public String getUnitName() {
		return "켤레";
	}

}
