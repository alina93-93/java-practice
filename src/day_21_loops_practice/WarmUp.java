package day_21_loops_practice;

import java.util.Scanner;

public class WarmUp {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	
	do {
		System.out.println("Enter 2 numbers");
		int i1 = scan.nextInt();
		int i2 = scan.nextInt();
		sum = i1+i2;
	} while (sum<=100);
	System.out.println("Good Numbers");
	
	
	
}	
}