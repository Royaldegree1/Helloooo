package Class11;

public class Largest {	//INTERVIEW QUESTION

	public static void main(String[] args) {
		// create an array of integers and find largest number
		
		
		int[] numbers = {1,3,2,5,4};
				
		int largest=numbers[0];
	
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];	
	}
		}System.out.println("The largest number is "+largest);
		}}

