package javaAssignments.week3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
			String text1 = "stops";						//input1
			String text2 = "potss"; 					//input2
			System.out.println("String1: " +text1);
			System.out.println("String2: " +text2);
			
			int length = text1.length();				//length of string1
			int length2 = text2.length();				//length of string2
			
			if(length==length2) {
				
				System.out.println("After sort String1: ");
				char[] charArray = text1.toCharArray();		//string1 to char
					Arrays.sort(charArray);					//sorting
					System.out.println(charArray);
					
				System.out.println("After sort String2: ");	
				char[] charArray2 = text2.toCharArray();	//string2 to char				
					Arrays.sort(charArray2);				//sorting
					System.out.println(charArray2);
										
				if(Arrays.equals(charArray, charArray2)) {	//condition
					
					System.out.println("The given string is Anagram");
				
				}else
					
				{
					System.out.println("Not anagram");
					
				}
				
			} 
			
			

	}

}
	
