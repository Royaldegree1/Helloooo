package Class11;

public class ForEachLoop {

	public static void main(String[] args) {
		// Advanced for loop
		
//		int[] numbers = {12,13,14,15,16,17};
//		
//		//data type: array | collection
//		for(int monkey:numbers) {
//			System.out.print(monkey+ " ");
//	}
//		
//		
		String[] cars = {"BMW", "Mercedes", "Saturn", "Ford", "Jaguar", "Camero"};
			for (String array:cars) {
				System.out.print(array+ " ");
			}
			
		String[] automobiles = {"BMW", "Mercedes", "Saturn", "Ford", "Jaguar", "Camero"};
			for (int i=0; i<=cars.length-1; i++) {
				System.out.println(automobiles[i]+ " ");
			}
			
		String[] country = {"USA", "Russia", "Turkey", "Spain"};
			for(int i=0; i<country.length; i++) {
				
				if(country[i].equals("USA")) {
					System.out.println("Washington DC");
				}else if (country[i].equals("Russia")) {
					System.out.println("Moscow");
				}else if (country[i].equals("Turkey")) {
					System.out.println("Ankara");
				}else if (country[i].equals("Spain")) {
					System.out.println("Madrid");
				}
			}
				String[] countries = {"USA", "Afghanistan", "Kazakhstan", "Ukraine"};
				
				for(String countryy:countries) {
					
					switch(countryy) {
					case"USA": 
						System.out.println("Washington DC");
					break;
					case "Afghanistan":
						System.out.println("Kabul");
					break;
					case "Kazakhstan":
						System.out.println("Astana");
					break;
					case "Ukraine":
						System.out.println("Kiev");
						break;		
					
					}
				}
				
				
			
			
			
			
//		int[] numbers = {1,2,3,4,5};
//		 { 
//			System.out.print(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);
//		}
				
		int[] num = {1,2,3,4,5};
		for (int array:num) {
			System.out.print(array+ " ");
		}
		
		
				
				
				
		}
			
			
			
		}
		
		
		
		
	
