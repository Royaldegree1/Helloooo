package Class21;

public class Employee {
	
	int eID, salary;
	
	public static String CEO = "Sumair";
	
	public static void main (String[] args) {
		
		
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		CEO= "Sumair";
		employee1.eID=1;
		employee1.salary=1000;
		employee1.infoProfile();
		
		employee2.eID=2;
		employee2.salary=3000;
		employee2.infoProfile1();
		
	}
	public void infoProfile(){
		System.out.println(eID+" "+salary+" "+CEO);
	}
	
	public void infoProfile1() {
		System.out.println(eID+" "+salary+" "+CEO);
	}

}
