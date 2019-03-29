
public class Review3b {

	public static void main(String[] args) {
		// Program that will use a switch statement for which day of the week
		//Program that will use a switch statement for which month we are in
		
		int day =  3;
		String dayName;
		
		
		switch (day) {
		
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		
			default:
				dayName= "invalid day";
				break;
		}
			
	System.out.println("Today is " +dayName);
	
	
	
//	int month=3;
//	String monthName;
//	
//	if(month==1) {
//		monthName="January";
//	}else if (month==2) {
//		monthName="Febuary";
//	}else if (month==3) {
//		monthName="March";
//	}else if (day==4) {
//		monthName="April";
//	}else if (day==5) {
//		monthName="May";
//	}else {
//		monthName="Invalid";
//	}
//System.out.println("Month today is "+monthName);
		
		
		
		
		
	}
	}
	
