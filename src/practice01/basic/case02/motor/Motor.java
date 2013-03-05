package practice01.basic.case02.motor;

public abstract class Motor {
	public String getType(){
		return "electric motor";
	}
	
	public abstract int getRpm();
	public abstract boolean isHandheldDevice();
}
