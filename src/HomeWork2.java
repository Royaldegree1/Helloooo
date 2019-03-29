import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// Program to find largest number among three numbers using nested if
		//provided by a user (numbers must be distinct)
		
	int num1, num2, num3;//largest
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct double values");
		
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		//5 , 3 , 4
		if (num1>num2) {
			if (num1>num3) {
				System.out.println(num1+ " is the largest");
			} else { 
				System.out.println(num3+ " is the largest");}
			}else{//assuming num2>num1
			if (num2>num3) {
				System.out.println(num2+ " is the largest");
			}else {
				System.out.println(num3+ " is the largest");
				
				//if(num1>num2){
//				if (num1>num3) {
//				largest=num1;
//				}else {
//					largest=num3;
//				System.out.println(" The largest number is "+largest);
				}
			}
	}
}


