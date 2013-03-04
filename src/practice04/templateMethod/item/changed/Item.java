package practice04.templateMethod.item.changed;

public abstract class Item {

	private int unitPrice;
	private int quantity;
	
	public abstract String getName();
	public abstract String getUnitName();

	public Item(int unitPrice, int quantity){
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	public int getTotalPrice(){
		return getUnitPrice() * getQuantity();
	}

	// 영수증 문구를 찍는 부분
	public String getReceiptText(){
		return getName() + ", " + getQuantity() + getUnitName() + " * " 
			+ getUnitPrice() + "원 : 합계 " + getTotalPrice() + "원"; 
	}
	
	private int getUnitPrice() {
		return this.unitPrice;
	}
	
	private int getQuantity() {
		return this.quantity;
	}
}
