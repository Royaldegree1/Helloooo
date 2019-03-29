package Class11;

public class Task1And2 {

	public static void main(String[] args) {
		// Create and array of cars: american, german, korean, italian. 
		//Then retrieve all values from that array
		
		String[][] cars = {
			{"American","German","Korean","Italian"},
				{"GMC","Mercedes","Hyundai","Ferrari"}
		};
	
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+ " ");
		}
			System.out.println();
			

	}

}
