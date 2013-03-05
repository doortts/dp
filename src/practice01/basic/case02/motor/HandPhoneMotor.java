package practice01.basic.case02.motor;

public class HandPhoneMotor extends Motor {

	@Override
	public int getRpm() {
		return 300;
	}

	@Override
	public boolean isHandheldDevice() {
		return true;
	}


}
