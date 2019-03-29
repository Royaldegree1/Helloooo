package HomeworkAssignments;

import java.util.Scanner;

public class ConditionalStatementFourFive {
	
	public static void main (String[] args) {
	
//	Write a program to take values of length and width from user and check if it the shape of the object is square or rectangle. 
//
//	Examples:
//
//	Please enter the length 18
//	Please enter the width 16
//	The shape of your object is rectangle
//
//	Please enter the length 16 
//	Please enter the width 16 
//	The shape of your object is square
	
	Scanner scan;
	scan = new Scanner(System.in);
	
	int length, width;
	
	
	System.out.println("Please enter the length");
	length=scan.nextInt();
	System.out.println("Please enter the width");
	width=scan.nextInt();
	
	if(length>16) {
		System.out.println("The shape of your object is rectangle");
	}else{
		System.out.println("The shape of your object is square");
		
	}
	}
	
	
	
	
	

}
