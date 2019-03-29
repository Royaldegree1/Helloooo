import java.util.Scanner;

public class TaskScannerFor {

	public static void main(String[] args) {
		// let user define a range of numbers to print
		
		Scanner scan;
		scan = new Scanner (System.in) ;
		
		System.out.println("Please enter a starting number");
		int startNumber=scan.nextInt();
		
		System.out.println("Please enter ending number");
		int endNumber=scan.nextInt();
		
		if(startNumber<endNumber) {
		
		for(int i=startNumber; i<+endNumber; i++) {
			System.out.println(i);
		}
		}else {
			System.out.println("I wont run your code");
	}
	}
}
