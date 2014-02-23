package practice02.strategy.changed;

public class EmailBase {

	private String [] emailList;
	private Sorter sorter;

	public EmailBase(String [] emailList) {
		this.emailList = emailList;
	}

	public void printOut(){
		for (String name : this.emailList) {
			System.out.println(name);
		}
	}

	public void sortEmailList(){
		sorter.sort(this.emailList);
	}

	public void setSorter(Sorter sorter){
		this.sorter = sorter;
	}


}
