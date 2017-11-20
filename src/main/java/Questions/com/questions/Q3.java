package Questions.com.questions;

public class Q3 {

	public static void main(String[] args) {
		
		int[] lst = new int[] {12,2,7,11,6,8,9};
		Q3 q3 = new Q3();
		int x = 1;
		
		if(q3.findContain(lst, x)) {
			System.out.println(x +" is element of Array");
		}else {
			System.out.println(x +" is not element of Array");
		}
		
		q3.sortOfList(lst);
	}

	public boolean findContain(int[] lst, int x) {
		
		for(int i = 0; i< lst.length; i++) {
			if(x == lst[i]) {
				return true;
			}
		}
		return false;
	}
	
	public int[] sortOfList(int[] lst) {
		
		boolean swapped = true;
		int k;
		int x = 0;
		while(swapped) {
			swapped = false;
			x++;
			for(int i = 0; i < lst.length-x; i++) {
				
					if(lst[i] > lst[i+1]) {  	//12 > 2  i=0 x=1
						k = lst[i]; 				//k=12
						lst[i] = lst[i+1];		//lst[0]=lst[1] -->> 2,2,7....
						lst[i+1] = k;			//lst[1]=12 -->>2,12,7....
						swapped = true;
					}
			}
		}
		for(int sr : lst) {
			System.out.print(sr+", ");
		}
		System.out.println();
		return lst;
		
		
	}
}
