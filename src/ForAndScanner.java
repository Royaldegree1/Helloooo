import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		// prompt user to enter integers and compare
		//At the end print largest
		
		Scanner scan;
		int num1, num2;
		int largest=0;
		
		scan = new Scanner(System.in);
		
		
		for (int i=1; 1<=5; i++) {
			
		System.out.println("Please enter 2 number");
			num1=scan.nextInt();
			num2=scan.nextInt();
		
		if(num1>num2) {
			largest=num1;
		}else if(num2>num1) {
			largest=num2;
		}else {
			System.out.println(num1+ "is equale to " +num2);
		}
			System.out.println(largest+" is the largest");

	}
	}
}
