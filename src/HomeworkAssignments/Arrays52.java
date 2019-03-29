package HomeworkAssignments;

public class Arrays52 {
	
	public static void main(String[] args) {
	
	
//	Write a program that creates an array of integers that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
//	Print only values that stored with even index including 0
//
//	Hint:
//
//	 
//	45 12 55 23 88 
		
//		
//		int[] array=new int[9];
//		  
//		  array[0]=45;
//		  array[1]=78;
//		  array[2]=12;
//		  array[3]=67;
//		  array[4]=55;
//		  array[5]=89;
//		  array[6]=23;
//		  array[7]=77;
//		  array[8]=88;
//		  
//		  
//		  System.out.println(array[0]+" "+array[2]+" "+array[4]+" "+array[6]+" "+array[8]);
//		  
//		  
//	
//		
//		int[] array={45,78,12,67,55,89,23,77,88};
//		System.out.println(array[0]+" "+array[2]+" "+array[4]+" "+array[6]+" "+array[8]);
		
//		
//		int[] arr = {45,78, 12,  67, 55, 89, 23, 77, 88};
//
//		for (int i = 0; i < arr.length; i+=2) {
//
//			System.out.print(arr[i] + " ");
			
			int[]numbers= {45,78,12,67,55,89,23,77,88};
			for (int i=0; i<numbers.length; i+=2) {
				System.out.print(numbers[i]+" ");
			}
	}
}
