package practice03.adapter.changed;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SortboyAdapterTest {

	@Test
	public void testSort() {
		//Given
		String[] address = {"charlie", "bravo", "alpha"};
		
		//When
		SortboyAdapter adapter = new SortboyAdapter();
		adapter.sort(address);
		
		//Then
		assertEquals("alpha", address[0]);

	}

}
