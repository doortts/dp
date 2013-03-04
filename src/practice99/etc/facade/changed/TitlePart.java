package practice99.etc.facade.changed;

public class TitlePart {
	private String title;

	public TitlePart(String title) {
		this.title = title;
	}
	
	public String toHtmlString(){
		return "<TITLE>" + this.title + "</TITLE>";
	}
	
}
