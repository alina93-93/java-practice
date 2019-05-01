package day_14_StringMethods_Manipulation;

import java.util.Scanner;

public class WOrds {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter 2 words");
	
	String word1 = scan.next();
	String word2 = scan.next();
	
	if (word1.length() > word2.length()) {
		System.out.println(word1+" is longer");
	}else if (word2.length() > word1.length()) {
		System.out.println(word2 +" is longer");
		
	}
	
	
	
	
	
	

	}
}