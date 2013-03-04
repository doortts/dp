package practice09.etc.facade.changed;

import practice09.etc.facade.before.BodyPart;
import practice09.etc.facade.before.HtmlTag;
import practice09.etc.facade.before.TitlePart;

public class HtmlProducer {

	public static String getHtmlCode(String titleText, String bodyText) {
		TitlePart titlePart = new TitlePart(titleText);
		BodyPart bodyPart = new BodyPart(bodyText);

		HtmlTag htmlDocument = new HtmlTag();
		
		String result = htmlDocument.startTag();
		result +=  titlePart.toHtmlString();
		result += bodyPart.toHtmlString();
		result += htmlDocument.endTag();
		
		return result;
	}

}
