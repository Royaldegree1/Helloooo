package HomeworkAssignments;

import java.util.Scanner;

public class Arrays58 {
	
	public static void main (String[] args) {
		
////		Note: Create a Scanner Class
//		Create an int array with the size of 5 and input values with Scanner.  Print out each element of the array multiplied by ten, one element per line. Create a loop and enter values into one loop, the second loop print the values and it must be multiplied by 10.
//
//
//		Input:
//		1
//		2
//		3
//		4
//		5
//
//		Output
//		10
//		20
//		30
//		40
//		50

		
		Scanner scan;
		scan = new Scanner (System.in);
		
		int[] integers = new int[5];
		
		for(int i=0; i<5; i++) {
			integers[i] = scan.nextInt();
		}
		for(int a=0; a<integers.length; a++) {
		System.out.println(integers[a]*10);
		}}}
			
		
		
			
	
		
	


