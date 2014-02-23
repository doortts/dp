package practice03.adapter.changed;

import java.util.Arrays;
import java.util.List;

import practice02.strategy.changed.Sorter;
import practice03.adapter.before.SortBoy;

public class SortboyAdapter implements Sorter{

	public void sort(String[] list) {
		List myList = Arrays.asList(list);
		SortBoy sortBoy = new SortBoy(myList);
		myList = sortBoy.sortCloneList();
		list = (String[])myList.toArray();
	}

}
