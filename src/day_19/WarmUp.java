package day_19;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is yours current balance");
		
	double balance = scan.nextDouble();
	int count = 0;
	
	
	while (balance > 0) {
		count++; //increase transaction by 1;
		System.out.println("What is transaction #"+count+" amount? ");
		double trans = scan.nextDouble();
		
		if (trans > balance ) {
			System.out.println("You balance is negative due to this transactions");
		}
		
		balance  = balance - trans; // or:  balance -= trans;
		System.out.println("current balance : "+balance);
	}
	
	System.out.println("You have unsufficient funds, your balance is: "+balance);
	System.out.println("Transactions total count: "+count);
	
	}
}
