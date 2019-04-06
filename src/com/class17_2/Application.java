package com.class17_2;

import Class17.Calculator;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScannerMethod scnMthd = new ScannerMethod();

		Calculator calc = new Calculator();
		
		int x = 10, y = 100;
		
		calc.sum(x,y);
		System.out.println();
		
		calc.sub(x, y);
		System.out.println();
		
		calc.div(x, y);
		System.out.println();
		
		calc.mult(x, y);
		System.out.println();
		
		
		
		

	}

}
