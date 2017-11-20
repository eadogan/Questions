package Questions.com.questions;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Q5Test {

	@Test
	public void checkTwoElements_shouldEqualSum_whenTwoElements() {
		Q5 q5 = new Q5();
		int[] lst = new int[] {1,2,4,5,6,7,8,0};
		int actual = q5.checkTwoElements(lst, 13);
		int excepted = 2;
		assertTrue(actual == excepted);
	}
}
