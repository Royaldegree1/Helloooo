package Class16;

public class Car {
	
	String make, model, color;
	int door, wheels;
	
	public static void main(String[] args) {
		
		//ClassName variableName = new ClassName();
		//1 object
		Car car1=new Car();
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door=4;
		car1.wheels=4;
		
		// Car honda has 4 wheels
				System.out.println("Car "+car1.make+" has "+car1.wheels+" wheels");
				
		//define behavior
		car1.drive();
		car1.reverse();
		car1.stop();
		
		
		//2 object
		Car car2= new Car();
		car2.make="Tesla";
		car2.model="X";
		car2.color="Blue";
		car2.door=4;
		car2.wheels=4;
		
		System.out.println("--------------------Second Object--------------------");
		//My car is blue Tesela
				System.out.println("My car is "+car2.color+" "+car2.make);
		car2.drive();
		car2.reverse();
		car2.stop();
	}
	
	void drive() {
		System.out.println("Car can drive");
	}
	
	void reverse() {
		System.out.println("Car can reverse");
	}
	
	void stop() {
		System.out.println("Car can stop");
		
	}
	

}
