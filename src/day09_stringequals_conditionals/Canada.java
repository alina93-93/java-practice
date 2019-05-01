package day09_stringequals_conditionals;

import java.util.Scanner;

public class Canada {
	public static void main(String[] args) {
		 // create a class - Canada
		//Ask user :What is the capital of Canada  - using
		// scaner assign the value to capital variable
		//Check if the answer is correct
		// false
		// you answer is incorrect - value is not capital of Canada
		
		Scanner keybord = new Scanner(System.in);
		
		System.out.println("What is the capital of Canada?");
		 String capital = keybord.nextLine();
		
		// if (capitalOfCanada == "Ottawa") {     // wrong
		 
		 if (capital.equals("Ottawa")) {          // right way1 
			//also //capital.equalsIgnoreCase = will ignore: upper/lower -case
			 
			 
			 System.out.println("Correct! "+capital+" is capital of Canada");
		 }else {
			 
			 System.out.println("Incorrect "+capital+" - it is not capital of Canada");
		 }
		 
		
		
		
	}

}
