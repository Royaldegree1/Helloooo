package com.Review;

public class ContactArithmeticInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 20;
		
		String a = "Hello";
		String b = "Bye";
		
		System.out.println(x+y+a+b);//30HelloBye
		System.out.println(x+a+y+b);//10Hello20Bye
		System.out.println(x+a+b+y);//10HelloBye20
		System.out.println(a+b+x+y);//HelloBye30 wrong 
		System.out.println(a+b+(x+y)); //HelloBye30 correct
		
		
		System.out.println();

	}

}
