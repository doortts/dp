package practice04.factoryMethod.case02.changed;

public class SorterFactory {
	public static Sorter getSorter(String [] emailList){
		
		if ( hasSpace(emailList) )
			return new NonspaceSorter();
		else
			return new NormalSorter();
	}
	
	public static boolean hasSpace(String [] emailList){
		for (int i = 0; i < emailList.length; i++) {
			if ( emailList[i].lastIndexOf(" ") != -1 )
				return true;
		}
		
		return false;
	}
}
