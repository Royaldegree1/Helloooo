package Class14;

public class Task123 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces
		
		// Create a String that should be combination of letters, numbers, and special characters.
		// Find out how many alpha characters are there in the String.
		
		// You have a String a="Is it Saturday! Is it raining! Do we have a Java class today?"
		// How would you find out how many sentences are in that String?
		
		String str="Hello how are you";
		System.out.println(str.replaceAll(" ", ""));
	
		String str2="Hello123 how are$%# you";
		String replaced=str2.replaceAll("[A-z0-9]", "");
		System.out.println(replaced);
		
		
		
		

		
	}		
}
