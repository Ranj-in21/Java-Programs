package javaAssignments.week3;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] A = {1,2,3,4,7,6,8};	//input
		int length = A.length;		//array length
		System.out.println("Length of array:" +length);
		Arrays.sort(A);				//sort
		
		for (int i = 0; i < A.length; i++) {
			int num = A[i]-1;
			if(i!=num) {			//missing element
				System.out.println("The missing element is:" +num);
				break;
			}
			
			
		}
		
		
		
	}

}
