package day_30_Methods;

import java.util.Scanner;

public class WarmUp {
	public static void print5Stars () {
		
		System.out.println("* * * * *");
		// call print5Stars  100 times

	}
		
	public static void main(String[] args) {
		
		print5Stars ();
		for (int i = 1; i<=100; i++) {
		print5Stars();
	}	
		
		introduce();
		introduce();
	
	}	
	
	
	public static void introduce() {
		
	Scanner scan = new Scanner (System.in);
		
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you "+name);
		System.out.println();
		
		
	}
	

}
		
			
	
