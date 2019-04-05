package Class17;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		
		int stringLength=str.length();
		System.out.println(stringLength);
		
		MethodWithReturnValue obj=new MethodWithReturnValue();
		//String str=obj.askHowAreYou("Asel");
		String day=obj.whatIsADay();
		System.out.println("Today is "+day);
	}
	
	void askHowAreYou(String name) {//parameter
		System.out.println("How are you "+name);
	}
	
	String whatIsADay() {
		System.out.println("I am inside a method");
		return "Thursday";
		

	}

}
