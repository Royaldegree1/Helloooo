import java.util.Scanner;

public class StringsSwitchTask1 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it.
		//Once values are captured print which language user speaks
		
		//Allow user to enter guide and then provide explanation: A-Excellent, B-Good, C-Average
		//D-Bad, any other grade --> Not acceptable. At the end your program should print which grade 
		//was entered by a user with explanation.
		
		//Homework: Using scanner class create calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/).
		//Based on operator provide the result to user.
		
		String language;
		String country;
		char grade = 'A';
		
		
		
		
		Scanner input;
		
		input= new Scanner (System.in);
		
		System.out.println("Enter your country ");
		
		country = input.nextLine();
		
		switch (country) {
		
		case "USA":
			language="English";
			System.out.println("Enter Grade");
			grade = input.next().charAt(0);
			break;
			
		case "China":
			language="Chinese";
			grade = input.next().charAt(0);
			break;
		case "Spain":
			language="Spanish";
			grade = input.next().charAt(0);
			break;
		default:
			language="Unknown";}
			
		
		}
		
		

	}

