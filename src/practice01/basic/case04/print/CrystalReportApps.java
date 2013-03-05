package practice01.basic.case04.print;

public class CrystalReportApps {
	
	IPrinterDriver printerDriver;
	
	public CrystalReportApps(IPrinterDriver printerDriver) {
		this.printerDriver = printerDriver;
	}
	
	public void report(String text){
		printerDriver.print("========= Analysis Report ========");
		printerDriver.print( text );
		printerDriver.print("");
		printerDriver.print("All rights are reserved" );
		printerDriver.print("========= report end here ========");
	}
	
}
