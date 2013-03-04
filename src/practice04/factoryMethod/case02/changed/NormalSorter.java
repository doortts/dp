package practice04.factoryMethod.case02.changed;

import java.util.Arrays;

public class NormalSorter implements Sorter{
	public NormalSorter() {
		System.out.println("NormalSorter");
	}
	public void sort(String [] list){
		Arrays.sort(list);
	}
}
