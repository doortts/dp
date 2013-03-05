package practice01.basic.case03.noise;

public class NoiseChecker {
	public void checkDecibel(int decibel){
		if (decibel == 0 ) {
			System.out.println("No sounds!!");
		} else if ( decibel > 0 && decibel < 10){
			System.out.println("Silent Object");
		} else if ( decibel >= 10 && decibel < 100){
			System.out.println("Noisy Object");
		} else if ( decibel >= 100){
			System.out.println("Terrible Noise!!!");
		} else {
			System.out.println("Check device!");
		}
	}
}
