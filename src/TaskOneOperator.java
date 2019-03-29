import java.util.Scanner;

public class TaskOneOperator {

	public static void main(String[] args) {
		// Write a program prints out if it is good weather to go for any activity.
		//If the temperature is between 40 degrees and 80 degrees inclusive & no rain-->
		//we will go for hiking unless it is raining--> we will not go hiking
		//IF temperature is between 25 and 40 inclusive & snowing --> going snowboarding otherwise
		//we are not going snowboarding
		//it if temperature if more than 80 & sunny-->  go to the beach
		//otherwise --> not go to the beach
		//answer on phone
		
		Scanner input;
		boolean snow, rain, sunny;
		int temp;
	    String activity="";
		
		input = new Scanner(System.in);
		
		System.out.println("Please enter a temperature");
		temp = input.nextInt();
		
		if (temp>=40 && temp<=80) {
		System.out.println("Is it raining? ");
		rain=input.nextBoolean();
		if (rain) {
			activity = "watch a movie";
		}else {
			activity = "go hiking";
		}
		}else if(temp>=25 && temp<40) {
			System.out.println("Is it snowing? ");
			snow=input.nextBoolean();
			
			if(snow) {
				activity="snowboarding";
			}else {
				activity="lets code";
			}
		}else if (temp>=80) {
			System.out.println("Is it sunny? ");
			sunny=input.nextBoolean();
			
			if(sunny) {
				activity="go to beach";
			}else {
				activity="do more coding";
			}
		}else {
			System.out.println("Please enter different temperature");
			activity="Unknown";
		}
				System.out.println("My activity for today is " +activity);
				
	}

}
