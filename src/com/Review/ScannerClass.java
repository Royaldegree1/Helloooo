package com.Review;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// ask a user for the name and print Good morning _

		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name=input.nextLine();
		
		System.out.println("Good morning " +name);
		
		
	}

}
