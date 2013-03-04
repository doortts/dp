package practice02.strategy.changed;

import java.util.Arrays;

public class NonspaceSorter implements Sorter{
	public void sort(String [] list){
		for (int i = 0; i < list.length; i++) {
			list[i] = list[i].replaceAll(" ", "");
		}
		Arrays.sort(list);
	}
}
