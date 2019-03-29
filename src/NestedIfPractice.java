
public class NestedIfPractice {

	public static void main(String[] args) {
		// check if user has credit card--> check what is the balance
		//if balance is more then 1000--> pay off now
		//else "you are good"
		
		boolean creditCard = true;
		int balance = 1000;
		
		if (creditCard) {
			System.out.println("Lets check the balance");
			if(balance>=1000) {
				System.out.println("pay off now");
			}else {
				System.out.println("You are safe");}
				} else {
					System.out.println("Do you want a credit card");
				}

	}

}
