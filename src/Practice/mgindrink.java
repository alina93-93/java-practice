package Practice;

import java.util.Scanner;

public class mgindrink {
public static void main(String[] args) {
	  
	
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter numbers of milligrams in drink:");
	    int mg = scan.nextInt();
	    int drinks = 10000 / mg;
	    
        System.out.println("It would take about "
	    +drinks+" drinks for a lethal overdose");
	    	
	    
}
}
