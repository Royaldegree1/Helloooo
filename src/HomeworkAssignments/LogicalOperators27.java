package HomeworkAssignments;

import java.util.Scanner;

public class LogicalOperators27 {
	
	public static void main(String[] args) {
		
	
//	Create a program that prompt user with question:  Do you need a loan?
//			If the result is true then prompt user with question: What is your credit score? Otherwise eligibility = "Unknown"
//			Based on the score define users eligibility 
//			if score is below  600 --> eligibility = "Not eligible"
//			if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
//			if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
//			if score is higher than any other previous values --> eligibility = "Definitely eligible" .   
//
//			The output of the program should be: "The eligibility is ____"
		
		Scanner scan;
		scan = new Scanner(System.in);
		Boolean response;
		String eligibility;
		int score;
		
		System.out.println("Do you need a loan?");
		response = scan.nextBoolean();
		
		System.out.println("What is your credit score?");
		score = scan.nextInt();
		
		if(score<600) {
			eligibility = "Not eligible";
		}else if (score>=600 && score<=700) {
			eligibility = "Maybe eligible";
		}else if (score>=701 && score<=800) {
			eligibility = "Eligible";
		}else if (score>800) {
			eligibility = "Definitely eligible";
		}else {
			eligibility = "unknown";}
			System.out.println("The eligibility is " +eligibility);
			
		}
			
		}
			

