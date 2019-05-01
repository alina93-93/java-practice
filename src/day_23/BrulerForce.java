package day_23;

import java.util.Scanner;

public class BrulerForce {
public static void main(String[] args) {
	
	
	
	String expectedUserName = "admin";
	String expectedPassword = "admin123";
	String username = "";
	String password = "";
	int attempts  = 5;
	
	Scanner scan = new Scanner (System.in);
	
	do {
		if ( attempts == 0) {
			System.out.println("You have exceeded number ");
			System.out.println("This user as deactivated for 30 min");
			return;
		}
		
		attempts--;
		System.out.println("Please enter user name ");
		username = scan.next();
		if (!username.equals(expectedUserName)) {
			System.out.println("Wrong user name ");
			System.out.println("Attempts left: "+attempts);
			continue;
		}
		System.out.println("Please enter the password");
		password = scan.next();
		if (!password.equals(expectedPassword)) {
			System.out.println("Wrong password");
			System.out.println("Attempts left"+attempts);
			continue;
			
		}
		
	}while (!username.contentEquals(expectedUserName) || !password.equals(expectedPassword));
		System.out.println("Login suucsesfull");
		
	}	
		
	}



