package day_39;

import java.util.ArrayList;
import java.util.Collections;

public class CitiesWarmUp {
	public static void main(String[] args) {
		
ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        cities.add("Lima");
        
        for (String city : cities) {
        	System.out.print(city+" | ");
        }
        System.out.println();
        System.out.println();
		 
        for( int i =0; i < cities.size(); i++) {
        	System.out.print(cities.get(i)+" | ");
        }
        
        System.out.println();
		System.out.println();
		
		System.out.println(cities.toString().toUpperCase());
		
		
		System.out.println();
		for( int i =0; i < cities.size(); i++) {
        	System.out.print(cities.get(i).toUpperCase()+" | ");
        }
		
		System.out.println();
		System.out.println();
		/// make each city all up-case
		String paris = cities.get(0).toUpperCase();
		cities.get(0);
		System.out.println(cities.get(0));
		cities.set(1, cities.get(1).toUpperCase());
		
		for (int j = 0; j < cities.size(); j++) {
			String city = cities.get(j).toUpperCase();
			cities.set(j, city);
		}
		
		System.out.println(cities.toString());
		
		// find the longest and shortest city
		
		String longestC = "", shortestC = "";
		
		
		for (String city : cities) {
			if ( city.length()>longestC.length()) {
				longestC = city;
			}
		}
		shortestC = cities.get(0);
		for (String city : cities) {
			if ( city.length()<shortestC.length()) {
				shortestC = city;
			}
		}
		System.out.println();
		System.out.println("Longest name of the city's list "+longestC);
		System.out.println("Shortest : "+shortestC);
		
		
		ArrayList<String> citiesMoreThan6 = new ArrayList<>();
		// assign all cities that have more than 6 chars to this arrayList 
		
		for (String ct : cities) {
			if (ct.length() >6 ) {
				citiesMoreThan6.add(ct);
			}
		}
		System.out.println(citiesMoreThan6);		
		
		
	}

}
