package Class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		// create a grocery list: fruits{}
		//						veggies{}
		//						dairy{}
		// Retrieve all values using 2 different loops
		
		String[][] groceries = {
							{"apple", "orange", "pear"},
						   {"spinach", "potatoes", "squash"},
						   {"milk","cheese","ice cream"}
		};
		
						   for(String[]singleArray:groceries) {
							   for(String list:singleArray) {
								   System.out.print(list+" ");
							   }
							   		System.out.println();
						   }System.out.println("______________________________________");
							   		
							   		for(int i=0; i<groceries.length; i++) {
							   			for(int y=0; y<groceries[i].length; y++) {
							   			System.out.print(groceries[i][y]+" ");
							   		}System.out.println();
							   		
						   
				
						   }}}
	

