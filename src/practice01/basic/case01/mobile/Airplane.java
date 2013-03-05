package practice01.basic.case01.mobile;

public class Airplane extends Mobile {

	@Override
	public String contains() {
		return "People and Cargo";
	}

	@Override
	public boolean canMoveOverWater() {
		return true;
	}


}
