package day_23;

import java.util.Scanner;

public class CalculateSum {
public static void main(String[] args) {
	// lets write a program
	// that will calculate a sum of 6 numbers
	// if numbers is less or equals to 0, ignore this 
	// we need to ask user to provide a number
	
	int sum = 0;
	int num = 0;
	Scanner scan = new Scanner(System.in);
	for (int i = 0; i <3; i++) {
		System.out.println("Enter the number");
		num= scan.nextInt();
		if (num<=0) {
			continue;
		}
		sum+=num;
		}
	System.out.println("total sum: "+sum);
	}
	

	
	
}

