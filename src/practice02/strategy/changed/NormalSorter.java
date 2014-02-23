package practice02.strategy.changed;

import java.util.Arrays;

public class NormalSorter implements Sorter{
	public void sort(String [] list){
		Arrays.sort(list);
	}
}
