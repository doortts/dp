package practice99.etc.factoryMethod.case02.before;

import java.util.Arrays;

public class NonspaceSorter implements Sorter{
	public NonspaceSorter() {
		System.out.println("NonspaceSorter");
	}

	public void sort(String [] list){
		for (int i = 0; i < list.length; i++) {
			list[i] = list[i].replaceAll(" ", "");
		}
		Arrays.sort(list);
	}
}
