package Class15INTERVIEWQUESTIONS;

import java.util.Scanner;

public class IQ6Palindrome {

	public static void main(String[] args) {
		// Find whether a String is palindrome or not? (dad, mom, madam)
		
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.println("Please enter any word to check if it is a palindrome");
		
		String word=scan.nextLine();
		
		String reverse="";
		
		for(int i=word.length()-1;i>=0; i--) {
			reverse+=word.charAt(i);
		
		}
		if(word.equalsIgnoreCase(reverse)) 
			System.out.println("The word is palindrome ");
		else {
		System.out.print("The word is not palindrome");
	}
	}
}
