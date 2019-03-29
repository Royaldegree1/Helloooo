package HomeworkAssignments;

import java.util.Scanner;

public class ConditionalStatementFourOne {
	
	public static void main(String [] args) {
		
	
	
//	Instructions from your teacher:
//		IMPORTANT: You must use a Scanner class for this conditional statement
//
//		Input variable in console using 121.
//		Find out if a number is Even or ODD
//		Please display "Even" if number is even
//		and "Odd" if the number is an odd number
	
	Scanner scan;
	
	scan = new Scanner (System.in);
	
	boolean v=true;
	int a=121;
	System.out.println("Input variable");
	a=scan.nextInt();
	
	if(v) {
		System.out.println("Odd");	
	}else {
		System.out.println("Even");
	}
	
	
}
}
