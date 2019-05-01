package day_21_loops_practice;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		
		System.out.println("How many items are you purchasing?");
		int itemsCount = scan.nextInt();
		double totalPrice = 0.0;
		String items = "";
		 for (int count = 1;  count <= itemsCount; count++) {
			 System.out.println("What is item "+count+" ?");
			 String itemName = scan.next();
			 System.out.println("How much is "+itemName+"?");
			 double itemPrice = scan.nextDouble();
				items += itemName+", ";
				totalPrice += itemPrice; 
		 }
		
	System.out.println("Your items: "+items);
	System.out.println("Your price: $"+totalPrice);	
		
		
	}

}
