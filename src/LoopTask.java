
public class LoopTask {

	public static void main(String[] args) {
		// create a boolean variable workDay and assign true
		//create int variable day and assign it to 1
		//as long as it it workDay print --> "I need a day off" and increment day
		//once day is 6 --> your condition for your loop should become false
		
		int day = 1;
		boolean workDay;
		
		
		while(day<=5) {
			System.out.println("Working day");
			day++;
			
			if(day>5) {
				System.out.println("I need a day off");
				
				
				//boolean workDay=true;
				//int day=1;
				//
				//while(workDay){
				//System.out.println("I need a day off");
				
				//if (day==6){
				//System.out.println("I do not need a day off");
				//workdDay=false;
				//}
				//day++;
				
			}
		}
		
		
		

	}

}
