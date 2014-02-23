package practice99.etc.factoryMethod.case02.changed;

public class EmailBase {

	private String [] emailList;
	private Sorter sorter;

	public EmailBase(String [] emailList) {
		this.emailList = emailList;
		this.sorter = SorterFactory.getSorter( emailList );
	}

	public void printOut(){
		for (String name : this.emailList) {
			System.out.println(name);
		}
	}

	public void sortEmailList(){
		sorter.sort(this.emailList);
	}

}
