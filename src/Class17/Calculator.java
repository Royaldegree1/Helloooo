package Class17;

public class Calculator {

	public static void main(String[] args) {


		
		Calculator calc = new Calculator();
		calc.sum(10,20);
		calc.sub(20,10);
		calc.div(50,25);
		calc.mult(8,24);
	}

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}

	public void mult(int a, int b) {
		System.out.println(a * b);
	}
}
