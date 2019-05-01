package day_24;

import java.util.Arrays;

public class SumOfTheNumbers {
	public static void main(String[] args) {
		//lets create an array of integers with length 3
		int []numbers = new int[3];
		//the 1st value in array
		numbers[0] = 5;
		// second value
		numbers[1] =10;
		//third
		numbers [2] = 20;
		//[I@4d591d15 this is hash code 
		System.out.println(numbers);
		// toString() from arrays class can help us to print an arrays as string
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		// please use for loop in order to loop through the array 
		//and calculate sum of all elements 
		// numbers.length --> returns num of elements in the array 
		// the final field array.length cannot be assigned
		//numbers.length = 5;
		for (int i =0; i<numbers.length; i++) {
			sum = sum + numbers [i];
			
		}
		System.out.println("Sum: "+sum);
		// find the biggest value in the array
		int max = Integer.MIN_VALUE;
		for (int i = 0; i<numbers.length; i++) {
		if (numbers [i]> max ) {
			max = numbers [i];
		}
			
		}
		System.out.println("Max value: "+max);
		// find min value
		
		int min = Integer.MAX_VALUE;
		for (int k = 0; k<numbers.length; k++) {
			if (numbers [k]< min ) {
			min = numbers [k];
			}
			
		}
		System.out.println("Min value: "+min);
	
	}
	

}
