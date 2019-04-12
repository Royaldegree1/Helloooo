package Class21;

public class InstanceVariables {
	
	String name = "John";//instance variable

	public static void main(String[] args) {
		
	String name = "Anna";//local variable
	System.out.println(name);
	System.out.println("---Changing value of local variable---");
	name="Olga";
	System.out.println(name);
	//creating 1 object
	InstanceVariables obj = new InstanceVariables();
	System.out.println(obj.name);
	obj.name="Jack";
	System.out.println(obj.name);
	//creating second object
	InstanceVariables obj1=new InstanceVariables();
	System.out.println(obj1.name);
	
	}
	public void hello(String name) {
		System.out.println("hello "+name);
	}

}
