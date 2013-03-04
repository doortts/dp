package practice04.factoryMethod.case01.before;


public class RuntimeCode {

	public static void main(String[] args) {
		
		String input = "OIL"; // 사용자가 지정
		
		String pictureStyle = null; //ink-and-wash :수묵화
		
		if ( input.equals( "OIL" ) ){
			pictureStyle = "유화";
		} else if ( input.equals( "INK-AND-WASH" ) ){
			pictureStyle = "수묵화";
		} else if ( input.equals( "PEN" ) ){
			pictureStyle = "펜화";
		} else {
			throw new IllegalArgumentException("그림 스타일을 정해 주세요!");
		}
		
		Brush brush = null;
		
		if ( input.equals( "OIL" ) ){
			brush = new OilBrush();
		} else if ( input.equals( "INK-AND-WASH" ) ){
			brush = new SumieBrush();
		} else if ( input.equals( "PEN" ) ){
			brush = new PenBrush();
		} else {
			throw new IllegalArgumentException("스타일에 맞는 브러시가 없습니다!");
		}
		
		// 타이틀 출력
		System.out.println( "======= 화풍 ========");
		System.out.println( pictureStyle );
		System.out.println( "===================");
		
		//그림 그리기
		brush.drawCircle();
		brush.drawLine();
		
	}
}
