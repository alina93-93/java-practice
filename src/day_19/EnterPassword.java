package day_19;

import java.util.Scanner;

public class EnterPassword {
public static void main(String[] args) {
	Scanner scan= new Scanner (System.in);
	
	String password = "abc123";
	
	String input ;
	do {
		System.out.println("Enter the password");
		input = scan.next();
		
	}while (!input.equals(password));
	
	// if input not the same as password, keep asking enter the password
	
	
	
	
	
	
	
	
	
}
}
