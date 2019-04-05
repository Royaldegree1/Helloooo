package Class15INTERVIEWQUESTIONS;

public class IQ2SecondLargestMin {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		//Maximum and minimum number in the array?
		
		int[] arr = {144,46,1,86,292,2};
		
		int min= arr[0];//144
		int secondLargest= 0;//144
		int largest= 0;//144
	
		for(int a:arr) {
			if(a>largest) {
				largest=a;
				}
			if(a<min) {
				min = a;
			}
		}
		for(int a: arr) {
			if(a>secondLargest && a<largest) {
				secondLargest= a;
			}
		}
		System.out.println("min= "+min);
		System.out.println("Second Largest " +secondLargest);
		System.out.println("Largest " + largest);
	}

}
