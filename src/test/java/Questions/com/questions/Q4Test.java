package Questions.com.questions;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class Q4Test {

	@Test
	public void sortOfList_shouldSorted_whenNotSortedList() {
		Q4 q4 = new Q4();
		int[] lst = new int[]{2,3,5,6,8,9,0,1};
		int[] exceptedList = new int[] {0,1,2,3,5,6,8,9};
		int[] actualList = q4.sortOfList(lst) ;
		assertTrue(Arrays.equals(actualList, exceptedList));   //java.util.Arrays is important
	}
	
	@Test
	public void ListOfMinAndMax_shouldFindMinAndMax_whenSortedList() {
		Q4 q4 = new Q4();
		int[] lst = new int[]{1,2,3,5,6,8,38};
		String exceptedMinAndMax = "1, 38";
		String actual = q4.ListOfMinAndMax(lst);
		assertTrue(exceptedMinAndMax.equals(actual));
	}
}
