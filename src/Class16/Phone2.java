package Class16;

public class Phone2 { //phone
	
	//attributes or state or properties
	String brand, light,size;
	
	//actions or behaviors that are methods
	
//	takePic();
//	textMessage();
	
	

//	attributes/properties: brand, light, size;
//	Behaviors/actions: takePic, textMessage;
	
	public static void main(String[] args) {
	
	Phone2 phone1= new Phone2();
		
	phone1.light="bright";
	phone1.size="small";
	phone1.brand="iPhone";
	
	phone1.takePic();
	phone1.textMessage();
	
	Phone2 phone2 = new Phone2();
	
	phone2.light="dark";
	phone2.size="big";
	phone2.brand="Android";
	
	phone2.takePic();
	phone2.textMessage();
	
	Phone2 phone3 = new Phone2();
	
	phone3.light="dim";
	phone3.size="medium";
	phone3.brand="Nokia";
	
	phone3.takePic();
	phone3.textMessage();
	
	}
	
	void takePic() {
		System.out.println("We can take pictures on our phone "+brand);
	}
	void textMessage() {
		System.out.println("We can text message on our phone "+brand);
	}
}
