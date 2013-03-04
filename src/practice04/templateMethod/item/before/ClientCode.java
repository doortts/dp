package practice04.templateMethod.item.before;

public class ClientCode {

	public static void main(String[] args) {
		Item item = new Item("BYC양말",1000, "켤레", 10);
		System.out.println( item.getReceiptText() );
		
		Item item2 = new Item("파코라반 양복상의",300000, "벌", 1);
		System.out.println( item2.getReceiptText() );
	}
}
