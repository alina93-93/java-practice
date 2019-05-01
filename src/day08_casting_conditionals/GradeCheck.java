package day08_casting_conditionals;

import java.util.*;

public class GradeCheck {
public static void main(String[] args) {

	//A B C D
	
	//char grade = scan.next().charAt(0);
	// if grade is 'A' => 
	// Exacellent Job ! Keep it up!
	/*else 
	 * how many points did you miss for A?
	 * int points = scanner 
	 * print the message 
	 * print "your garde B is not good enough ". 
	 * "You could get on 10 points more if you studied harder"
	 * 
	 */
	
	Scanner keyboard = new Scanner (System.in);
	
	System.out.println("What is your grade? ");
	char grade = keyboard.next().charAt(0);
	 
	if (grade == 'A') {
		System.out.println("Excellent Job! Keep it Up");
	}else {
		System.out.println("How many points did you miss for 'A'?");
		int points = keyboard.nextInt();
		
		System.out.println("You coud earn  "+points+" more points if you studied herder" );
		
		
		
		
		
		
		
		
	}
	
	
}
}
