package Class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		
	
		// Accept username, password and confirm password and check following requirements:
		//Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”. 
		//Password should be minimum 8 characters, if less → message=”Password is too short”.
		//Password cannot contain username if so, → message=”Password cannot contain username”.
		//Password should match confirmed password, if not  → message “Passwords do not match”.
		//Only after all requirements met → message “Your username and password has been created”
		
		Scanner scan;
		scan = new Scanner(System.in);
		
		String userName, passWord, confirmPassword,message= ""; //look at message
				
				
		System.out.println("Enter username");
		userName= scan.nextLine();
		
		System.out.println("Enter password");
		passWord= scan.nextLine();
		
		System.out.println("Please confirm password");//1 checkpoint
		confirmPassword=scan.nextLine();
		

		
		if (!(userName.isEmpty() && passWord.isEmpty())) {
			
			if(passWord.length()>8) {//2 checkpoint
				
				if(!passWord.contains(userName)) {//3 checkpoint
					
					if(passWord.equals(confirmPassword)) {//4 checkpoint
					
				}else {
					message="Password cannot contain username";
				}				
				}else {
					message="Password is too short";
				}
			}else{
			message="Username and Password can not be empty";
			}
			System.out.println(message);
			}
			
		}
}

	

