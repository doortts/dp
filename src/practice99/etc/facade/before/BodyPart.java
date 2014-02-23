package practice99.etc.facade.before;

public class BodyPart {
	private String bodyText;

	public BodyPart(String bodyText) {
		this.bodyText = bodyText;
	}
	
	public String toHtmlString(){
		return "<BODY>" + this.bodyText + "</BODY>";
	}
	
}
