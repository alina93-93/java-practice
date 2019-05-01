package day11_logical_nested_if;

import java.util.Scanner;

public class LoginTests {
public static void main(String[] args) {
 
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your username");
	String username = scan.nextLine();
	
    System.out.println("Enter your password");
	String password = scan.nextLine();
	
	String validUsername = "a@mail.com";
	String validPassword = "WoodenSpoon123";
	
	if (username.equalsIgnoreCase(validUsername) && password.contentEquals(validPassword)) {
	System.out.println("login successful");
	
	}else if ( username.equalsIgnoreCase(validUsername) && !password.equals(validPassword) ) {
	System.out.println("Invalid pasword");
	
	}else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword) ) {
		System.out.println("Invalid User name");
	
	}else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword) ) {
		System.out.println("Invalid User name and Invalid password");
	}
}
}
