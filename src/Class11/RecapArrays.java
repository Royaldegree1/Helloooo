package Class11;

public class RecapArrays {

	public static void main(String[] args) {
		// let's create an array of names that will hold 5 elements and retrieve all values from it
		
		
		
		//declaring // "=" means initializing
//		String[] names = new String[5];
//		
//		names[0]="Asel";
//		names[1]="Awet";
//		names[2]="Arif";
//		names[3]="Weqas";
//		names[4]="Dzmitri";
//		
		
//		array out of bounce "runtime exception"
//		names[5]="Shiva";
		
//		for(int i=0; i<names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		//create an array using array literal
		
		// FOR LOOP
		String[] studentNames= {"Shaban", "Bilaal", "Mehmet", "Zaki", "Samir", "Frank"};
		for(int i=0; i<=studentNames.length-1; i++) {
			System.out.println(studentNames[i]);
			
		}System.out.println("-------------");
		
//		retrieve values using: advance for loop, for each loop, enhanced for loop
		// ADVANCED FOR LOOP
		
		//type of array		//array name
		for(String student:studentNames) {
			System.out.println(student);
		
		
		
		}
	}}


