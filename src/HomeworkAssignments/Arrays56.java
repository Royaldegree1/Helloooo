package HomeworkAssignments;

import java.util.Scanner;

public class Arrays56 {
	
	public static void main(String[] args) {
		
		//Note: Create a main Method, and also use a Scanner Class
//		Write a program that creates an array of strings with the size being 7. Ask the user to input Days of a week beginning with Sunday. Add these inputs to your array and then print all values from that array
//
//		Hint: 
//
//		Please enter day 1 of the week
//		Sunday
//		Please enter day 2 of the week
//		Monday
//		Please enter day 3 of the week
//		Tuesday
//		Please enter day 4 of the week
//		Wednesday
//		Please enter day 5 of the week
//		Thursday
//		Please enter day 6 of the week
//		Friday
//		Please enter day 7 of the week
//		Saturday
		
		Scanner scan;
		scan = new Scanner (System.in);
		String[]  days = new String[7];
		
		for(int i=0; i<days.length; i++) {
		
		System.out.println("Please put day " +(i+1)+ " of the week");
		days[i] = scan.next();
		}
		for(int a=0; a<days.length-1; a++) {
			System.out.print(days[a]);
		}
		
		
		
		
		
		
		
		
	}

}
