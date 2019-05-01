package Practice;

import java.util.Scanner;

public class secMin {

	public static void main(String[] args) {
	    //YOUR CODE HERE:
	    
	    Scanner scan = new Scanner(System.in);
	    int inputSeconds, hours, minutes, seconds; 
	    
	    System.out.println("Enter seconds:");
	     seconds = scan.nextInt();
	     minutes = seconds / 60;
	     inputSeconds = seconds % 60;
	     hours = minutes / 60;
	     minutes = minutes % 60;
	     

	     


	    
	    
	    System.out.println(hours+" hours, "+minutes+" minutes, and "+inputSeconds+" seconds");
	    
	  }
	}
