package Questions.com.questions;

public class Q5 {

	public static void main(String[] args) {
		Q5 q5 = new Q5();
		int[] lst = new int[] {0,2,-9,4,5,8,9,-4,7};

		System.out.println(q5.checkTwoElements(lst, 9));
		
	}
	
	public int checkTwoElements(int[] lst, int x) {
		int count = 0;
		
		for (int i = 0; i < lst.length; i++) {
			for (int j = i; j < lst.length; j++) {
				if(i != j) {
					if(x == (lst[i]+lst[j])) {
						 count++;
					}
				}
				
			}
		}
		return count;
		
	}

}
