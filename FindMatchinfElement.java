package week1day3;


public class FindMatchinfElement {
	public static void main(String[] args) {
		//declare the arrays
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		
		//use for loop to iterate
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				
				//use if statement and == condition to find the matching pair
				if (a[i]==b[j])
				{
					System.out.println("The matching numbers are : "+a[i]);
				}
				
			}
		}
		
	}

}
