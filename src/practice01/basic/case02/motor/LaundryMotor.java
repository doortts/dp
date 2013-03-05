package practice01.basic.case02.motor;

public class LaundryMotor extends Motor {

	@Override
	public int getRpm() {
		return 1000;
	}

	@Override
	public boolean isHandheldDevice() {
		return false;
	}

}
