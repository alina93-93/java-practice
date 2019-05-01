package day_13_ternary_string_intro;

import java.util.Scanner;

public class CarSelector {
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Which type of car you are intersted?");
		System.out.println("1)American\n2)Japanese\n3)German\n4)Italian\n5)Korean");
		
		
		int carType = scan.nextInt();
		
		double averagePrice = 0.0;
		String carOptions = "";
		String carOrigin = "";
		
		switch(carType) {
		case 1:
			averagePrice = 33000.0;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigin = "American";
			break;
		case 2:
			averagePrice = 32000.0;
			carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
			carOrigin = "Japanese";
			break;
		case 3:
			averagePrice = 55000.0;
			carOptions = "BMW, VW, Audi, Mercedes, Porshe";
			carOrigin = "German";
			break;
		case 4:
			averagePrice = 85000.0;
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			carOrigin = "Italian";
			break;
		case 5:
			averagePrice = 25000.0;
			carOptions = "Kia, Hyundai, Daewoo";
			carOrigin = "Korean";
			break;
		default:
			System.out.println("Car type not available");
			return; //stop execution. Dont run rest of code		
		}
		
		System.out.println("You selected "+carOrigin+" car and your options are "+carOptions+".");
		System.out.println("Average Price: "+averagePrice);	
	
			
			
			
		}
		
}
