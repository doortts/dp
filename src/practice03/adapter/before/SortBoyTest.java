package practice03.adapter.before;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SortBoyTest {

	@Test
	public void testSortCloneList() {
		//Given
		List<String> address = new ArrayList<>();
		address.add("alpha");
		address.add("charlie");
		address.add("bravo");
		
		//When
		SortBoy boy = new SortBoy(address);
		List<String> sortedClone = boy.sortCloneList();
		
		//Then
		assertEquals("[alpha, bravo, charlie]", sortedClone.toString());
		assertEquals("[alpha, charlie, bravo]", address.toString());  //not sorted original
	}

}
