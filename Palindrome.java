package javaAssignments.week3;


public class Palindrome {

	public static void main(String[] args) {
		
		String name = "madam";
		
		char[] charArray = name.toCharArray(); 			//string to char
		
		System.out.println("Reverse Name:");
		
		for (int i = charArray.length-1; i>=0; i--) {	//reverse the array
			System.out.print(charArray[i]);
		}
			String newrev = new String(charArray);		
			
			if(name.equals(newrev))					//condition to compare strings
			{
				System.out.println("\nThe given string is Palindrome");
			}
			else {
				System.out.println("\nThe given string is not Palindrome");
			}	
				
		
	}
}
