package week1day3;

import java.util.Arrays;



public class FindMissingElement {

public static void main(String[] args) {
	
	//assign the array
	int a[] = {1, 4,3,2,8, 6, 7};
	
	//sort the array
	Arrays.sort(a);
	
	//use for loop to iterate
	for (int i = 0; i < a.length; i++) {
		
		//use if clause to find the missing elements
		
		if (a[i] != i+1) {
			System.out.println(i+1);
			
			//break the iteration
			break;
		}
	
		
	}
	
}
}
