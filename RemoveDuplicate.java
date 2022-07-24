package week3.day1;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		int count=1;
		
		String[] words = text.split(" ");
		
				for (int i = 0; i < words.length; i++) {
							
							
					for (int j = 0; j < words.length; j++) {
						
						if(words[i].equals(words[j])) {
							
							count++;
						}
						
					}
					if(count>1) {
						
						System.out.println(words[i].replace("java", " "));
						
					}
				}

	}

}
