import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// Prompt user to ask the name 3 times and print "You are doing great ___"
//		
//
		Scanner scan;
		scan = new Scanner(System.in);
//		
//		String name;
//		int a=1;
//		
//		
//		while(a<=3) {
//			System.out.println("Please enter your name");
//			name=scan.nextLine();
//			System.out.println("You are doing great " +name);
//			a++;}
		
//		Ask user to pay for a soda
//		keep asking user to pay for soda until entered price is not equal to 1.99
//		after user got a right amount print "Please enjoy your soda"
		
		String pay;
		double price;
		
		do {		
		System.out.println("Please pay for soda");
		price = scan.nextDouble();
		
		}while(price!=1.99);
		System.out.println("Please enjoy your soda");
				
		
		
	}

}
