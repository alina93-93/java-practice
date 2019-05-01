package day_21_loops_practice;

import java.util.Scanner;

public class GetUniqueCharacters {
public static void main(String[] args) {
	
	System.out.println("enter the word");
	Scanner scan = new Scanner (System.in);
			
	String word = scan.next(); // java
	
	String unique = "";
	
	for (int i = 0; i < word.length(); i++) {
		// read the letter and  assign
		char letter = word.charAt(i);
	    //System.out.println(letter);
		if (!unique.contains(""+letter)) {
			unique += letter;
		}
	}
	
	System.out.println(unique);
	
	
	
	
	//  for (int i = 0; i< word.length(); i++) {
   //   System.out.print(i);
  //    System.out.println(word.charAt(i));
 //      }
	
	
	
	
	
	
	
	
	
	
}
}
