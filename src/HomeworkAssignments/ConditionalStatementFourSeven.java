package HomeworkAssignments;

import java.util.Scanner;

public class ConditionalStatementFourSeven {
	
	public static void main (String [] args) {
		
	
	
//	Write a program that shows if you input a number it will display a month associated to it and if you input a number out of bounds of (12) it will display invalid. Display the months
//	to to be displayed on my output.
//
//	Hint: Add a main method, also import a Scanner Class and use the scanner for int.
//
//
//	1 will display January
//	2 will display February
//	3 will display March
//	4 will display April
//	5 will display May
//	6 will display June
//	7 will display July
//	8 will display August
//	9 will display September
//	10 will display October
//	11 will display November
//	12 will display December
//	ANY INPUT outside of 12 should display in output "Invalid"

	Scanner scan;
	scan = new Scanner(System.in);
	
	int number = 12;
	
	System.out.println("Enter a number");
	number = scan.nextInt();
	
	if(number==1) {
		System.out.println("January");
	}else if(number==2) {
		System.out.println("Feburary");
	}else {
		System.out.println("Invalid");
	}
	}
	}
	