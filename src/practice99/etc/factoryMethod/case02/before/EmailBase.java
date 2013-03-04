package practice99.etc.factoryMethod.case02.before;

public class EmailBase {

	private String [] emailList;
	private Sorter sorter = null;

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

	public boolean hasSpace(){
		for (int i = 0; i < emailList.length; i++) {
			if ( emailList[i].lastIndexOf(" ") != -1 )
				return true;
		}

		return false;
	}

}
