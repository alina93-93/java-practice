package Practice;

import java.util.Scanner;

public class GuestList {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Please enter guest name:");
		boolean newGuest;
		String name = input.nextLine();
		 
		do {
		    System.out.println("Do you want to enter new guest name:");
		    newGuest = input.nextBoolean();
		  	
		   if ( newGuest = true ){
		      System.out.println ("Please enter guest name:");
		      name = input.nextLine();
		    
		    } else  {
		    	System.out.println("Guest List");
		    	
		    }
		}
		while(!name.equals(true));  
	
		
	
}
}