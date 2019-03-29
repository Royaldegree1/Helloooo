package Class10;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
//	Guessing game with secret numbe and then a winner!
		
		Scanner scan;
		scan = new Scanner(System.in);
		
		int secret, userNumber;
		
		secret = 13;
		
		System.out.println("Please enter any number from 1 to 20");
		
		do {
			
			userNumber=scan.nextInt();
			
			if(userNumber<secret) {
				System.out.println("Number is too small, try again");
			}else if(userNumber>secret) {
				System.out.println("Number is too large, try again");
			}
			}while(secret!=userNumber);
				System.out.println("Congrulations! You got it!");
				
		}
}
		

	


