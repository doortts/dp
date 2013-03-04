package practice99.etc.factoryMethod.case01.changed;

public class RuntimeCode {

	public static void main(String[] args) {
		
		String input = "OIL"; // 사용자가 지정
		
		PictureStyle pictureStyle = null;
		if ( input.equals( "OIL" ) ){
			pictureStyle = new OilStyle();
		} else if ( input.equals( "INK-AND-WASH" ) ){ //ink-and-wash :수묵화
			pictureStyle = new SumieStyle();
		} else if ( input.equals( "PEN" ) ){
			pictureStyle = new PenStyle();
		} else {
			throw new IllegalArgumentException("그림 스타일을 정해 주세요!");
		}
		
		pictureStyle.createBrush();
		
		// 타이틀 출력
		System.out.println( "======= 화풍 ========");
		System.out.println( pictureStyle.name() );
		System.out.println( "===================");
		
		//그림 그리기
		pictureStyle.draw();
		// ....
	}
}
