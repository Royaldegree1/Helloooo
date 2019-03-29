import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) {
		// //Write a program that allows a user to input age to find out if the user is either Too Young, Young Person, Middle Age Person, or  too Old
        // Age should NOT be greater than 18  print out  Too Young
        // Age should be between 18 and 35 inclusive  print out Young Person
        // Age should greater 36 or less than or equal to 60 inclusive print out  You are Middle Age Person
        // If the age is greater than 60 print print out  You are too Old
        // Create an int variable named age
        // Must use a Scanner
		
		Scanner input;
		
		input = new Scanner (System.in);
		int age;
		String output;
		
	
		System.out.println("Please enter your age");
		age = input.nextInt();
		
		if(!(age>18)) {
			output = "Too Young";	
		}else if (age>18 && age<+ 35) {
			output= "Young person";
		} else if (age == 36 || age <+99) {
			output = "You are middle age person";
		}else {
			output = "You are too old";}
		
			System.out.println(output);
		
	}}
		
		

	


