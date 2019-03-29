import java.util.Scanner;

public class LogicalTaskTwo {

	public static void main(String[] args) {
		// Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
		// and determine the grade based on the following rules:
//				if the average score >=90 =>grade=A
//				if the average score >= 70 and <90 => grade=B
//				if the average score>=50 and <70 =>grade=C
//				if the average score<50 =>grade=F

		Scanner input;
		int quiz;
		int midTerm;
		int finalGrade;
		int average;
		
						
		input = new Scanner(System.in);
		
		System.out.println("Please enter quiz score: ");
		quiz = input.nextInt();
		
		System.out.println("Please enter mid term score: ");
		midTerm = input.nextInt();
		
		System.out.println("Please enter final score");
		finalGrade = input.nextInt();
		
		average=(quiz+midTerm+finalGrade)/3;
		
		System.out.println("Average score is" +average);
		
		if (average >=90) {
			System.out.println("Your grade is A");
		}else if (average>= 70 && average <90) {
			System.out.println("Your grade is B");
		}else if (average>=50 && average < 70) {
			System.out.println("Your grade is C");
		}else if (average < 50) {
			System.out.println("Your grade is F");
		}
		
		
		
		
	}

}
