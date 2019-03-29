package HomeworkAssignments;

import java.util.Scanner;

public class ConditionalStatementFourTwo {
	
	public static void main (String [] args) {
	
//	Instructions from your teacher:
//		  The variable "name" holds a String user input 
//
//		Write a conditional statement starting on line 9 that does the following:
//		If name is equal to "Chen", print "teacher"
//		For any other input, print "student"
//
//		Examples:
//		In: Chen
//		teacher
//		In: Faa
//		student;

		Scanner scan;
		scan= new Scanner (System.in);
		
		boolean chen=true;
		String name;
		
		if(chen) {
			System.out.print("In: ");
			name=scan.nextLine();
			System.out.println("teacher");
			System.out.print("In: ");
			name=scan.nextLine();
			System.out.println("student");
			
		}else{
			System.out.println("null");
	
			
			
		}
		
		
		
		
	}
}
