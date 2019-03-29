package HomeworkAssignments;

import java.util.Scanner;

public class LogicalOperators26 {
	
	public static void main(String[] args) {
		
	
//	Prompt user with question: "Is it weekend?"
//		if it is not a weekend --> subject="Manual testing"
//		Otherwise --> subject="Java"
//
//		Output of the program should be: "Today you will be learning ____"
		
		
		Scanner scan;
		scan = new Scanner(System.in);
		
		Boolean weekend = true;
		String subject;
		
		System.out.println("Is it weekend?");
		weekend = scan.nextBoolean();
		
		if(!weekend) {
			subject= "Manual Testing";
		}else {
			subject= "Java";
		} System.out.println("Today you will be learning " +subject);
		}
	
	

}
