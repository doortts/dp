package practice09.etc.facade.changed;

public class BodyPart {
	private String bodyText;

	public BodyPart(String bodyText) {
		this.bodyText = bodyText;
	}
	
	public String toHtmlString(){
		return "<BODY>" + this.bodyText + "</BODY>";
	}
	
}
