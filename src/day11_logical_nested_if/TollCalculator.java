package day11_logical_nested_if;

import java.util.Scanner;

public class TollCalculator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Vehicle type");
		int carType = scan.nextInt();
		
		System.out.println("Is it rush hour: yes | no");
		String rushHour = scan.nextLine();
		 // check is ruchhour string is "yes" => assign true to isRuchHour
		// if it is "no" , assign false to isRushhour
		
		boolean isRushHour ;
		if (rushHour.equalsIgnoreCase("yes")) {
			isRushHour = true; 
		} else { 
		     isRushHour = false;
		}
		//System.out.println(isRushHour);
		
		double price = 0.0 ;
		if (carType == 1) {
			if(isRushHour) {
				price = 30.0;
			}else {
				price = 5.0;
			}
			
			
		}else if (carType ==2) {
			if (isRushHour) {
				price = 55.30;
			}else {
				price = 15.99;
			}
		}
		
		System.out.println("Tall price: ");
	}

}
