package Class16;

public class Computer {
	
	
	Boolean mouse, keyboard;
	int screen, ram;
	String brand;
	
	public static void main(String[] args) {
		

		Computer  comp1=new Computer();
		
		comp1.mouse=true;
		comp1.keyboard=true;
		comp1.screen=2;
		comp1.ram=8;
		comp1.brand="Hp";
		
		comp1.watchMovie();
		comp1.doJavaCoding();
		comp1.playMusic();
		
		System.out.println("-----------------------Object 2-------------------------");
		
		Computer comp2=new Computer();
		
		comp2.mouse=false;
		comp2.keyboard=false;
		comp2.screen=4;
		comp2.ram=6;
		comp2.brand="Apple";
		
		comp2.watchMovie();
		comp2.doJavaCoding();
		comp2.playMusic();
		
		
	}
	
	void watchMovie() {
		System.out.println("We can watch movie on a computer "+brand);
	}
	
	void doJavaCoding() {
		System.out.println("We can do Java coding on our computer "+brand);
	}
	
	void playMusic() {
		System.out.println("We can play music on our computer "+brand);
	}
	
	
	

	

	}
	
	
	
	
	


