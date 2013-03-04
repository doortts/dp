package practice05.templateMethod.barista.before;

public class ClientCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("커피 준비 =====");
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();

		System.out.println("\n홍차 준비 =====");
		Tea tea = new Tea();
		tea.prepareRecipe();
	}

}
