package Class15INTERVIEWQUESTIONS;

import java.util.Scanner;

public class IQ7PrimeNumber {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		// PrimeNumber should meet 2 conditions: divisible by 1 & by Itself ONLY
		// 2,3,5,7,11,13,17,19,23,29
		
		int number;
		
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.println("Please enter a number to check if it is prime");
		number= scan.nextInt();
		
		
		boolean prime=true;
		
		
		for(int i=2; i<number;i++) {
		if(number%i!=0) { 
		
		}else {
			prime=false;
			break;
		}
		}
		System.out.println(prime);
		}
	}



