package Questions.com.questions;


public class Q1 {
	
	public static void main(String[] args) {
		int[] lst= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20};
		Q1 q1=new Q1();
		int expectedSum=q1.sumOfNumbers(20);
		int missingNumber=q1.findMissingNumber(lst, expectedSum);
		System.out.println("Expected Sum : "+expectedSum);
		System.out.println("Missing Number : "+missingNumber);
		
	}

	
	public int sumOfNumbers(int countOfNumbers){
		int sum=0;
		for(int i = 1; i <= countOfNumbers; i++) {
			sum += i;		
		}
		return sum;
	}
	
	public int findMissingNumber(int[] lst,int expectedSum) {
		int sum=0;
		 for(int x = 0; x<lst.length; x++ ) {
			 sum += lst[x];
		 }
		 return expectedSum-sum;
	}
	
	
	
	
}
