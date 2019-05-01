package day18_while_dowhile_loops;

import java.util.Scanner;

public class EnterPincode {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int secretPincode = 1234;
	
	int pincode = 0;
	
	//keep asking for a pincode until correct one entered 
	
	// Access granted, select operation
	
	while (secretPincode != pincode ) {
		System.out.println("Enter pin code");
		pincode = scan.nextInt();
	}
	
	System.out.println("Access granted, select operation");
	
	
	
	
}

}
