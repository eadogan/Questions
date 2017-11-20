package Questions.com.questions;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class Q2Test {
	
	@Test
	public void findDublicateNumber_whenDublicateOrNot() {
		int[] list = new int[] {0,3,5,2,4,5};
		Q2 q2  = new Q2();
		boolean actual = true; 
		boolean excepted = q2.findDublicateNumber(list);
		assertFalse(excepted==actual);
		
	}

}
