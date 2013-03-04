package practice01.basic.mobile;


public class Car extends Mobile {

	@Override
	public String contains() {
		return "People";
	}

	@Override
	public boolean canMoveOverWater() {
		return false;
	}

}
