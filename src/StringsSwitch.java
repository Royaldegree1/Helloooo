import java.util.Scanner;

public class StringsSwitch {

	public static void main(String[] args) {
		// Prompt user to enter their country
		//based on the country --> specify favorite food

		Scanner input;
		String country;
		String favoriteFood;
		
		input=new Scanner(System.in);
		System.out.println("Please enter which country you are from");
		country=input.nextLine();
		
		switch (country) {
		
		case "USA":
			favoriteFood="burger";
			break;
		case "Afghanistan":
			favoriteFood="Palau";
			break;
		case "Russia":
			favoriteFood="Pelmeni";
			break;
		case "Italy":
			favoriteFood="Pasta";
			break;
		case "Kazakhstan":
			favoriteFood="Beshparmak";
				break;
		default:
			favoriteFood="Unknown"; }
			
			System.out.println("Your favorite food is "+favoriteFood);
			
			
			
		
		}
	}

