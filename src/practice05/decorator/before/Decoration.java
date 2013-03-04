package practice05.decorator.before;

public abstract class Decoration extends Coffee {

	/**
	 * 기본커피 위에 세 종의 데코레이션을 제공할 예정입니다.
	 * 
	 * 얼음추가 (+300원) : IceDecoration 클래스 
	 * 바닐라 시럽추가(+500원) : VanillaDecoration 클래스
	 * 카라멜 시럽추가(+500원) : CaramelDecoration 클래스
	 */
	protected Coffee coffee;

	public Decoration(Coffee coffee ) {
		this.coffee = coffee;
	}
}
