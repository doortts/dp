package practice09.etc.facade.before;

public class TitlePart {
	private String title;

	public TitlePart(String title) {
		this.title = title;
	}
	
	public String toHtmlString(){
		return "<TITLE>" + this.title + "</TITLE>";
	}
	
}
