package Questions.com.questions;

public class Q2 {
	
	public static void main(String[] args) {
		Q2 q2 = new Q2();
		int[] lst = new int[] {1,2,3,4};
		if((q2.findDublicateNumber(lst))) {
			//System.out.println(" Dublicated Number is "+lst[i]+" and Array indexes are "+i+", "+x+" ");
			System.out.println("Dublicated Array");
		}else {
			System.out.println("Not Dublicated Array");
		}
		
		
	}
	
	public boolean findDublicateNumber(int[] lst) {
		int[] expectedList = lst;
		boolean dublicated = false;
		for(int i = 0; i < lst.length; i++){
			for(int x =i+ 1 ; x <lst.length; x++) {
				if(expectedList[x] == lst[i]) {
					return  dublicated = true;
				}
			}
		}
		return dublicated;
	}

}

