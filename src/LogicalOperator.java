import java.util.Scanner;

public class LogicalOperator {

	
	// Write a Java program to ask user enter daily sales amount
	//Based on the sales range commission will be different
	//Example: sales is <100==> commission =2
	//sales more than 100 and less than 200 --> commission=5
	
	
	public static void main(String[] args) {
	Scanner input;
	
	int sales;
	int commission;
	
	input = new Scanner(System.in);
			System.out.println("Please enter sales amount");e
	sales=input.nextInt();
	
	if(sales>0 && sales<100) {
		commission=2;
	}else if(sales>=100 && sales<200) {
		commission=5;
	}else if (sales>=200 && sales<500) {
		commission=10;
	}else if(sales>=500) {
		commission=20;
	}else {
		commission=0;
	}
		System.out.println("Your commision is " +commission);
		
		
	}
	
	
		
	}

