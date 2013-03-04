package practice05.templateMethod.item.changed;

public class ClientCode {

	public static void main(String[] args) {
		Item item = getItem();
		System.out.println( item.getReceiptText() );
	}

	private static Item getItem() {
		return new Socks(1000, 10);
	}
}
