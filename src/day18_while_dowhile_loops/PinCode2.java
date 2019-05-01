package day18_while_dowhile_loops;

import java.util.Scanner;

public class PinCode2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int secretPincode = 1234;
		
		// give only 3 attemps
		// if attemps reach more then 3 times print card was blocked
		
		int pincode = 0;
		int attempts = 0;
		
		while (pincode != secretPincode && attempts <=3) {
			System.out.println("enter the pincode");
			pincode = scan.nextInt();
			attempts++;
			if (attempts == 3 && pincode != secretPincode) {
				System.out.println("Card is blocked");
				return;
			}			
		}
		
		System.out.println("acces granted . Select operation");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
