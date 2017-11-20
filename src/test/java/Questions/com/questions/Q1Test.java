package Questions.com.questions;



import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Q1Test {
	
	@Test
	public void sumOfNumbers_shouldCalculateSum_whenparameterIsBiggerThanZero() {
		int countOfNumbers=5;
		int expectedSum=15;
		Q1 q1=new Q1();
		int actual=q1.sumOfNumbers(countOfNumbers);
		assertTrue(actual == expectedSum);
	}

}
