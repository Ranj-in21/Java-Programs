package javaAssignments.week3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";					//input
		System.out.println("The given string: " +test);
		char[] str = test.toCharArray();			//string to charArray
		System.out.println("Change of odd index to uppercase:");
		for (int i = 0; i < str.length; i++) {		//iterate the char
			
			if((i%2)!=0) {							//odd index
				
				str[i] = Character.toUpperCase(str[i]);		//lowercase to uppercase
				System.out.print(str[i]);
				
				}else
	
				{
						
					System.out.print(str[i]);		//even index
				}
		
			}
	}
}


