
public class NestedIf {

	public static void main(String[] args) {
		// write a program to check work eligibility
		// if user us younger than <16 --> not allowed to work
		// otherwise --> allow to work. if user us younger than 64--> go to work
		// otherwise -->enjoy your life

		int age = 18;
		int eligibleAge = 16;
		int retirementAge = 64;

		if (age < eligibleAge) {
			System.out.println("You are too young, no work for you");
		} else {
			System.out.println("You are eligble to work");
		}
		if (age < retirementAge) {
			System.out.println("Go work hard");
		} else {
			System.out.println("Please enjoy your life. You do need to work");

			//I want to buy a car
			//1. I want Maseratti
			//2. I want red exterior
			//3. I want leather interior
			//4. I want 2 door
			
//			if (car is maserati) {
//				i will take a look
//				if (exterior is red) {
//				i will ask another question
//				if (interior is leather) {
//					i will buy a car
//				}else {
//					i am not buying your car
//				}else {
//					i wont look
//				}
//			}else {
//				i will walk away
				
			}
			
			
		}

	}

