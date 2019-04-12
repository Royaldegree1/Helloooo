package HomeworkAssignments;

public class Method86 {

	// For you to do
//		Multiple Parameters for method
//		create three method with  Multiple Parameters as int 
//		and write the logic in that method to perform multiplication,addition and subtraction
//		and call the method in main method with values 
//
//		1. for the addition method add two numbers to make 30 but put those numbers in the parameters
//		2. for multiplication multiply two numbers to make 30 but put those two numbers in your parameters
//		3. for Subtraction subtract two numbers to equal 20, with using parameters.
//		30 for addition
//		30 for multiplication
//		20 for subtraction
	public static void main(String[] args) {

		Method86 math1 = new Method86();

		math1.add(15, 15);
		math1.multiplication(15, 2);
		math1.subtraction(40, 20);
	}

	void add(int a, int b) {
		System.out.println(a+b);
	}

	void multiplication(int a, int b) {
		System.out.println(a*b);
	}

	void subtraction(int a, int b) {
		System.out.println(a-b);
	}

}
