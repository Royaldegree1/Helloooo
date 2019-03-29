package HomeworkAssignments;

import java.util.Scanner;

public class ConditionalStatementFourSix {
	
	public static void main (String[] args) {

//	Write a java program that prints out true if ( x * y ) return a positive value. Else prints out false if  (x * y) return a negative value. 
//
//			Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number"-for the 2nd number
//
//			Step 2: Create the if condition to check the X and Y value validation for the sign value
//
//			Step 3: If it is positive value user would get True if it negative value user would get false
		
		Scanner scan;
		scan = new Scanner(System.in);
		
		
		int x,y;
	
		

		System.out.println("Please enter first number");
		x = scan.nextInt();
		System.out.println("Please enter second number");
		y = scan.nextInt();
		
		if(x*y>0) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		
				
		
		
		
		
		
	}
}
