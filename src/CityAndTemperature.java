import java.util.Scanner;

public class CityAndTemperature {

	public static void main(String[] args) {
		// Ask user to enter city and temperature in Farenheit
		//Your program should convert F-->C
		//Your program should say "The temperature in the city __is__"
		
		String cityName;
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		
		cityName=myScanner.nextLine();
		
		System.out.println("Please enter temperature in Farenheit");
		
		temp=myScanner.nextInt();
		//fourmula (F-32) x 5/9;
		
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("the temperature in the city "+cityName+ "is "+convertedTemp+ "C");
	
		
		
			
		}

	}

