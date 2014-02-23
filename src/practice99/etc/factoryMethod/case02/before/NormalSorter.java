package practice99.etc.factoryMethod.case02.before;

import java.util.Arrays;

public class NormalSorter implements Sorter{
	public NormalSorter() {
		System.out.println("NormalSorter");
	}
	public void sort(String [] list){
		Arrays.sort(list);
	}
}
