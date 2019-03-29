package HomeworkAssignments;

public class Arrays62 {

	public static void main(String[] args) {
		// highest value
	
		int[][] numbers = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};	 
		
		
			int maxValue = numbers[0][0];
		
	        for (int j = 0; j < numbers.length; j++) {
	            for (int i = 0; i < numbers[j].length; i++) {
	                if (numbers[j][i] > maxValue) {
	                    maxValue = numbers[j][i];
	                }
	            }
	        }
	        System.out.println(maxValue);
		}
	

	}

