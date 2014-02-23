package practice99.etc.facade.changed;

public class ClientCode {

	public static void main(String[] args) {
		String titleText = "== 사용자 안내 페이지 ==";
		String bodyText = " 문의하실 내용이 있으시면 info@qustion.co.kr 로 메일 주세요.";
		
		// HtmlProducer 라는 클래스를 만들어서 사용합니다.
		
		System.out.println( HtmlProducer.getHtmlCode(titleText, bodyText) );
	}

}
