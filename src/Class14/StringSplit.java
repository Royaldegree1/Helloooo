package Class14;

public class StringSplit {

	public static void main(String[] args) {
		// 
		
		String str="Welcome Syntax Students Batch 4"; //3 splits 
		String[] array=str.split("S");
		System.out.println(array.length);
		
		for(String substring:array) {
			System.out.println(substring);
			
		}
	}

}
