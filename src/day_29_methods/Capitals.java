package day_29_methods;

import java.util.Arrays;

public class Capitals {
public static void main(String[] args) {
	
	String [] [] countriesArray = {
			{"USA", "Washington DC"},
			{"Canada", "Ottawa"},
			{"Mexico", "Mexico city"},
			{"Brasilia", "Brasil"},
			{"Lima", "Peru"},
			{"Argentina", "Buenos Aries"},
			{"Bolivia", "La Paz"},
			{"Mackedonia", "Skopje"},
			{"Kazakhstan", "Nursultan"}
	};

	// String [] [] c = new String [9] [2];
	
	System.out.println(countriesArray[0][0]+ " | "+ countriesArray [0][1]);
	System.out.println(countriesArray[8][0]+ " | "+ countriesArray [8][1]);
	System.out.println(Arrays.deepToString(countriesArray));
	
	for( int i = 0 ; i < countriesArray.length-1; i++ ) {
		System.out.print(countriesArray[i][0] + " | ");
	
	}
	System.out.println();
	
	
	for ( String [] country : countriesArray) {
		System.out.print(country[0]+" | ");
	}
	
	//get all  cities and add to citties array 
	// declare  cities array and size needs to match countries Array size 
	// String [] cities = new String[9]
	
	String [] cities = new String [countriesArray.length];
	System.out.println(Arrays.deepToString(cities));
	// null means no object
	
	for (int i = 0; i<countriesArray.length; i++) {
		cities [i]  = countriesArray[i] [1] ; 
	}
	
	System.out.println(Arrays.toString(cities));
	
	// Look for Bolivia in the countriesArray and test it
	System.out.println("*****************");
	
	System.out.println();
	
	for (int row = 0; row < countriesArray.length; row++) {
		if (countriesArray[row][0].equals("Bolivia")) {
			//System.out.println(countriesArray[row][1]);
			if (countriesArray[row][1].equals("La Paz")) {
		
				System.out.println("Bolivia test passed ");
			}else {
				System.out.println("Bolvivia failled the test");
			}
		break;
			
		}
	}

	
	
}
	
	
	
	
}

