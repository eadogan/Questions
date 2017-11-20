package Questions.com.questions;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class Q3Test {
	
	@Test
	public void findContain_shouldFind_whenArrayAndSearchingNumber() {
		int[] lst = new int[]{2,3,5,6,8,9,0,1};
		int x = 0;
		Q3 q3 = new Q3();
		boolean actual = q3.findContain(lst, x);
		boolean excepted = true;
		assertTrue(actual == excepted);
	}
	
	@Test
	public void sortOfList_shouldSorted_whenNotSortedList() {
		Q3 q3 = new Q3();
		int[] lst = new int[]{2,3,5,6,8,9,0,1};
		int[] exceptedList = new int[] {0,1,2,3,5,6,8,9};
		int[] actualList = q3.sortOfList(lst) ;
		assertTrue(Arrays.equals(actualList, exceptedList));   //java.util.Arrays is important
	}

}
