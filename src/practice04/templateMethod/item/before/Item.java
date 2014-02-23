package practice04.templateMethod.item.before;

public class Item {

	private String name;   // 상품이름
	private int unitPrice; // 단가
	private String unitName; // 수량 지칭 이름: 개, 켤레, 벌, 짝
	private int quantity; // 수량

	
	public Item(String name, int unitPrice, String unitName, int quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitName = unitName;
		this.quantity = quantity;
	}

	// 영수증 문구를 찍는 부분
	public String getReceiptText(){
		int totalPrice = getUnitPrice() * getQuantity();
		return getName() + ", " + getQuantity() + getUnitName() + " * " 
			+ getUnitPrice() + "원 : 합계 " + totalPrice + "원"; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
