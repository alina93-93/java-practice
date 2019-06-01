package Practice;

import java.util.*;

public class blabla {
	public static void main(String[] args) {
	    double weight = 0;
	    double cal = 0;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter weight in pounds:");
	   
	   
	  
	    weight = scan.nextDouble() / 2.2;
	    int c = (int)((10 * 30 + 8 * 30 + 6 * 60) * 0.0175 * weight);
	    System.out.println("Calories Burned: " + c);
	    
	  }
	}
