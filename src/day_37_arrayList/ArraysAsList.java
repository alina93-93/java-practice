package day_37_arrayList;

import java.util.ArrayList;

import java.util.*;
public class ArraysAsList {
	public static void main(String[] args) {
		List <String> cars = new ArrayList<>();
		cars.add("Honda");
		// declare and add values is a single statement 
		//Arrays class
		// 2nd opt
		
		List <Integer> nums = Arrays.asList(4,2,5,7,8);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		//nums.add(100);
		//System.out.println(nums.toString()); => will not work
		
		//create arraylist prices
		//assign 10 values
		
		List<Double> prices = Arrays.asList(12.4, 5.3, 500.0, 1230.50, 5.99, 12.0, 9874.44, 34.4, 123.5, 7.3);
		System.out.println(prices.size());
		System.out.println(prices.toString());
		System.out.println();
		
		//calculate sum
		double sum =0;
		for (Double price : prices) {
			sum+=price; // sum = sum+price;
			
		}
     System.out.println("Sum is : "+sum);
     double sum2 = 0;
     for (int i = 0; i<prices.size(); i++) {
    	 sum2 += (prices.get(i)); // sum2=sum2+prices.get(i);
     }
     System.out.println("Sum2 is : "+sum2);
     
     // create new List expensive 
     // add prices that are more than 100 
     //
     
     List <Double> expensive = new ArrayList<>();
     
     for (double price :prices) {
    	 if (price>100.0) {
    		 expensive.add(price);
    	 }
    	 
    	 
     }
	 
	System.out.println("Expensive: "+expensive.toString()); 
	
	//prices.removeAll(expensive);
	//System.out.println(prices.toString()); => need to us asList so it will work
     
}
}
	
	
	
	
	
	
	
	