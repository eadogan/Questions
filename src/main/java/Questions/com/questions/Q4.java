package Questions.com.questions;

public class Q4 {

	public static void main(String[] args) {
		Q4 q4 = new Q4();
		int[] lst = new int[] {0,2,5,1,8,9,4,7};
		for(int sr : q4.sortOfList(lst))
		System.out.print(sr+", ");
		System.out.println("\nList Of Min And Max Element "+q4.ListOfMinAndMax(q4.sortOfList(lst)));

	}

	public int[] sortOfList(int[] lst) {
		boolean swapped = true;
		int k, x = 0;
		while(swapped) {
			swapped = false;
			x++;
			for (int i = 0; i < lst.length-x; i++) {
				if(lst[i] > lst[i+1]) {
					k = lst[i];
					lst[i] = lst[i+1];
					lst[i+1] = k;
					swapped = true;
				}	
			}
		}
		return lst;
	}
	
	public String ListOfMinAndMax(int[] lst) {
		int min = lst[0];
		int max = lst[lst.length-1];
		return min+", "+max;
	}
}
