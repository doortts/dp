package practice01.basic.case04.print;

public interface IPrinterDriver extends IDriver {
	public String getPrinterName();
	public void testPrint();
	public void print(String text);
}
