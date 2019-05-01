package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseWithScaner {

public static void main(String[] args) {
//passingPercentage = 65;
	//yourScorePercentage = take from scanner
	//check if you passed or failed 
	
	
	
	Scanner input = new Scanner (System.in);
	
	int passingProcentage = 65;
	 
	 System.out.println("What is your score?");
	  
	 int yourScorePersentage = input.nextInt();
	  if (yourScorePersentage >= passingProcentage ) {
		  System.out.println("You passed!Congrats!");
}else {
	  
	System.out.println("you failed");
	 
	System.out.println("Java is fun!");
	
	
}	
}	
}
		

