
public class Review3c {

	public static void main(String[] args) {
		// // Write a program to found out the user level of experience
        // Must use a switch statement with  a String variable named levelString and a int variable named level
		
    // Beginner level should be 1
    // Intermediate level should be 2
    // Expert level should be 3
		
		int level = 1;
		
		String levelString;
		
		System.out.println("What is your level of experience?");
		
		switch (level) {
		
		case 1:
			levelString="Beginner level";
			break;
		case 2:
			levelString="Intermediate level";
			break;
		case 3:
			levelString="Expert level";
			break;
			
			default :
				levelString = "invalid level";
				break;}
				System.out.println(levelString);

				
		
				
				
				
				
		}		
	}
		
		
