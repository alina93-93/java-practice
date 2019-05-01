package day_16_string_manipulation;

import java.util.Scanner;

public class replace {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Type word(s)");
	
		String words = scan.nextLine();
		System.out.println(words.replace("a", "y"));
		
		//we can assign:
		//words = words.replace("a", "y")

	
		System.out.println(words.replace("sad", "happy"));
	
		System.out.println(words.replace(" ", "|"));
	
	
	
	
	
	
	
	
}
}
