package HomeworkAssignments;

import java.util.Scanner;

public class Array59 {
	
	public static void main(String[] args) {
		
//		Create Scanner class

//Write an array with size of 5. Use a loop to input values to the array. 
//		Then print out all the elements you have created in the first loop in reverse order. 
//
//Input: 
//1
//2
//3
//4
//5
//
//Output:
//5
//4
//3
//2
//1
		
		Scanner scan;
		scan = new Scanner(System.in);
		
		int[] array = new int[5];
		
		for(int i=0; i<5; i++) {
			array[i] = scan.nextInt();
		}
		for(int a=5; a>0; a--) {
		System.out.println(array[a]);
		}}
}
		
	
