package practice02.strategy.changed;

public class ClientCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] list = {"destiny@ejun.net",
				"pastfood@always.com", "astronaut@fmail.com", " destroy@coolmail.com"};

		EmailBase emailBase = new EmailBase(list);
		emailBase.printOut();

		emailBase.setSorter(new NormalSorter());

		emailBase.sortEmailList();
		System.out.println("--------------------------");

		emailBase.printOut();
	}
}
