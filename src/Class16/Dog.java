package Class16;

public class Dog {
	
	String brand, color;
	
	
//	attributes, state, properties: brand, color;
//	Behaviors, actions, methods: bark(), run();
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		dog1.brand = "Husky";
		dog1.color = "white";
		
		dog1.bark();
		dog1.run();
		
		Dog dog2 = new Dog();
		
		dog2.brand = "Bulldog";
		dog2.color = "black";
		
		dog2.bark();
		dog2.run();
				
		Dog dog3 = new Dog();
		
		dog3.brand = "Labrador";
		dog3.color = "brown";
		
		dog3.bark();
		dog3.run();
		System.out.println("This type of dog barks "+dog3.brand);
	}
	
	void bark(){
		System.out.println("This type of dog barks "+brand+color);
	}
	void run() {
		System.out.println("This type of dog runs "+brand);
		
		
		
	}
	
	
	

}
