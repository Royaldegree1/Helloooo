package Class16;

public class Phone {
	
	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.
	//Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviours.Message InputMessage #live_questions
	
	String brand;
	int memory, plan;
	
	
	public static void main(String[] args) {
		
	
	
	
	
	Phone phone1=new Phone();
	
	phone1.brand="iPhone";
	phone1.memory=5;
	phone1.plan=1;
	
	phone1.watchMovie();
	phone1.playMusic();
	phone1.callFriend();
	
	System.out.println("-------------Object 2-----------");
	
	Phone phone2=new Phone();
	
	phone2.brand="Android";
	phone2.memory=3;
	phone2.plan=2;
	
	phone2.watchMovie();
	phone2.playMusic();
	phone2.callFriend();
	
	System.out.println("------------------Object 3----------------");
	
	Phone phone3=new Phone();
	
	phone3.brand="Nokia";
	phone3.memory=1;
	phone3.plan=5;
	
	phone3.watchMovie();
	phone3.playMusic();
	phone3.callFriend();
	}
	
	void watchMovie() {
		System.out.println("We can watch movie on a phone "+brand);
	}
	
	void playMusic() {
		System.out.println("We can play music on our phone "+brand);
	}
	void callFriend() {
		System.out.println("We can call a friend on our "+brand);
	
	}
}
