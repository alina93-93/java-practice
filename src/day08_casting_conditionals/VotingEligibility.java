package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {
public static void main(String[] args) {

	/*
	 program to tell if you are eligible to vote.
	 votingAge = 18
	 yourAge = take from Scanner 
	 if your are eligible to vote:
	 you are eligible to vote 
	 you have been eligible for 3 years 
	 else
	 you are not 
	 eligible to vote 
	 you still have 3 more years to go 
	 */
	

	Scanner input = new Scanner (System.in);
	 System.out.println("How old are you?");
	  
	
	int votingAge = 18;
	 int yourAge = input.nextInt();
int howLong = yourAge - votingAge;
	int yearsLeft = votingAge - yourAge;

	
	 //yourAge = input.nextInt();
	  if (yourAge >= votingAge ) {
		  System.out.println("You are eligible!");
		  System.out.println("You have been eligible for "+howLong+"years");
}else {
	  
	System.out.println("You are not");
	System.out.println("you still need "+yearsLeft+" years");
	 
	
	
	
	
	
	
	
	
	
	
}
	
}	

}
