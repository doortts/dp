package practice09.etc.facade.before;

public class ClientCode {

	public static void main(String[] args) {
		String titleText = "== 사용자 안내 페이지 ==";
		String bodyText = " 문의하실 내용이 있으시면 info@qustion.co.kr 로 메일 주세요.";
		
		TitlePart titlePart = new TitlePart(titleText);
		BodyPart bodyPart = new BodyPart(bodyText);

		HtmlTag htmlDocument = new HtmlTag();
		
		System.out.println( titlePart.toHtmlString() );
		System.out.println( htmlDocument.startTag() );
		System.out.println( bodyPart.toHtmlString() );
		System.out.println( htmlDocument.endTag() );
		
	}

}
