package day_24;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {

		  // BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
        // 1. Step: Create an array of strings, and store these cars inside that array.
        String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
        // 2. Step: Print car names that starts with M
        for (String c : cars) {
            if (!c.startsWith("M")) {
                continue;
            }
            System.out.println(c);
        }
        System.out.println("******************");
        // 3. Step: Print all cars that have letter "r" somewhere in the name.
        // Please make your search case insensitive
        for (String make : cars) {
            if (make.toLowerCase().contains("r")) {
                System.out.println(make);
            }
        }
        //step4 print car names thats ends with "a"
        
        for(String car: cars) {
			if(car.toLowerCase().endsWith("a")) {
			
			System.out.print(car+", ");		
			}
        }
        // print all cars that have at least 6 letters in the name
       System.out.println("");
        System.out.println("*****************************");
        

        
        for (int i = 0; i<cars.length; i++) {
        	String car = cars[i];
        	if (cars[i].length() >=6) {
        	System.out.println(car);	
        	}
        }
        
        // swap last and last first car in the position 
  
    	String temp = cars[0];
    	cars [0] = cars[cars.length-1] = temp;
    	
        
        System.out.println(Arrays.deepToString(cars));
        
        
        
        
        
        
        
        
	}

}
