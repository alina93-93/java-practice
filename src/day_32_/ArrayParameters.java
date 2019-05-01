package day_32_;

import java.util.Arrays;

public class ArrayParameters {
	public static void main(String[] args) {
		
		int [] myArray = {44,22,66,11};
		printArray (myArray);
		printArray (new int [] {33,45,5,7} );
		int [] myNums =new int [] {3,4,5,6,7,3,42,2,5,45,6,5,3};
		printArray (myNums);
		
		int [] one = {10,2,3};
		int []	two = {3,1};	
		print2Arrays (one,two); // int [] one will be assign to firstArray, int[]two will be assign to secondArray
		
		
		print2ArraysV2 (one,two);
		
	}
	
	public static void printArray ( int[] nums) {
		
		for ( int n : nums ) {
			System.out.print(n + " ");
		}
		
		System.out.println();
	}

	
	
	public static void print2Arrays(int [] firstArray, int [] secondArray){
		
		if ( firstArray.length  > secondArray.length ) {
			//System.out.println(firstArray+""+secondArray);
			System.out.println(Arrays.toString(firstArray));
			System.out.println(Arrays.toString(secondArray));
	
		}else {
			//System.out.println(secondArray+""+firstArray);
			System.out.println(Arrays.toString(secondArray));
			System.out.println(Arrays.toString(firstArray));
		}
		
	}
	// version 2, we will call printArray method
	public static void print2ArraysV2 (int [] firstArray, int [] secondArray){
		if ( firstArray.length  > secondArray.length ) {
			printArray(firstArray);
			printArray(secondArray);

	}else {
		//System.out.println(secondArray+""+firstArray);
		printArray(secondArray);
		printArray(firstArray);
	}
	}
}
	

