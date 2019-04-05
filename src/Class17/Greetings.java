package Class17;

public class Greetings {

	public static void main(String[] args) {
		
		Greetings obj= new Greetings();
		
		obj.findLargest(20,10);// calling method FindLargest and passing values as 20&10
		obj.findLargest(30,31);// calling method FindLargest and passing values as 30&31
		obj.findLargest(2000, 664674);//// calling method FindLargest and passing values as 2000&664674
		obj.helloToInstructor("Asel");
		obj.helloToInstructor("Weqas");
		//how to find largest number
		
		
	}	
	void helloToInstructor(String name) {// method with 1 parameter
			System.out.println("Hello "+name);
	}	
	void hello() {//method signature
		System.out.println("Hello"); //method body
	
	}

	void findLargest(int a, int b) {// method with 2 parameters
	
		if(a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}	
	}
}
