package practice02.strategy.before;

import java.util.Arrays;

public class EmailBase {
	
	String [] emailList;
	
	public EmailBase(String [] emailList) {
		this.emailList = emailList;
	}
	
	public void printOut(){
		for (String name : this.emailList) {
			System.out.println(name);
		}
	}
	
	public void sortEmailList(){
		Arrays.sort(this.emailList);
	}
}
