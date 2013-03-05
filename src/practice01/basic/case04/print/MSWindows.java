package practice01.basic.case04.print;

import javax.naming.OperationNotSupportedException;

public class MSWindows {

	public static IPrinterDriver printerRegistry;
	
	public static void main(String[] args) {
		String userText = "x*x + y*y = z*z - Pythagoras' theorem ";
		CrystalReportApps apps = null;
		
		// ToDo : PrinterDriver 지정할것!! 
		
		// ToDo : 크리스탈 레포트를 이용해 userText 출력
	}
	
	// 시스템에 등록되어 있는 프린터 드라이버를 돌려준다.
	public static IPrinterDriver getPrinterDeriver() throws OperationNotSupportedException{
		if( printerRegistry == null ){
			throw new OperationNotSupportedException("No Printer Exists!!");
		}
		return printerRegistry;
	}
	
	// (제어판에서) 프린터를 등록한다.
	public static void setPrinterDriver(IPrinterDriver driver){
		printerRegistry = driver;
	}

}

