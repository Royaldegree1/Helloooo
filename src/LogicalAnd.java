
public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Logical AND &&
//		TRUE AND TRUE = TRUE
//		TRUE AND FALSE = FALSE
//		FALSE AND TRUE = FALSE
//		FALSE AND FALSE = FALSE
//		
//		Logical OR ||
//		TRUE OR TRUE = TRUE
//		TRUE OR FALSE = TRUE
//		FALSE OR TRUE = TRUE
//		FALSE OR FALSE = FALSE
//		
//		Logical NOT !
//		
//		true --> false
//		false -->true
//		
		
		//if number is between 1-10 --> number is small
		//if number is between 11-100 --> number is medium
		//if number is between 101-1000--> number is large
		
		int num=15;
		
		
		//true  AND false --> false
		if(num>=1 && num<=10) {
			System.out.println("number is small");
			//true   AND   true ---> true
		}else if(num>=11 && num<100) {
			System.out.println("number is medium");
			// false   AND  true --> false
		}else if (num>=101 && num<=1000) {
			System.out.println("number is large");			
		}else {
			System.out.println("number is not in our range");
		}

	}

}
