import java.util.Scanner;

public class ScannerAndIf {

	public static void main(String[] args) {
		// take 2 numbers from a user and compare those numbers

		int num1, num2;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number");
		
		num1=scan.nextInt();
		
		System.out.println("Please enter second number");
		
		num2=scan.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		if (num1>num2) {
			System.out.println(num1+" is larger than " +num2);
		}else {
			System.out.println(num1+" is smaller than "+num2);
		}

		System.out.println("I am done");
		
	}
}
