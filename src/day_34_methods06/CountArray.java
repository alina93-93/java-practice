package day_34_methods06;

import java.util.Random;

public class CountArray {
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,5,6,6,7,5,5,12};
		//1) with Print return right away
		System.out.println(findOcurences(nums,5));
		System.out.println(findOcurences(nums,6));
		//2) assign return value into variable
		
		
		int five =  findOcurences (nums ,4);
		System.out.println("5 Values "+five);
		
		if (five >0) {
			System.out.println("we have 5s");
		}else {
			System.out.println("no 5s are here");
		}
		
		if(findOcurences (nums, 2)>0 ) {
			System.out.println("We have 2s are here");
		}else {
			System.out.println("no 2s are here");
		}
		
		//create array and pass the method 
		findOcurences (new int [] {10,20,20,30,55,22}, 20);
		
		
		
		
	}
	
	public static int findOcurences (int[] array, int value ){
		int counter =0;
		for  ( int num : array ) {
		  if ( num == value ) {
			  counter++;
		  }
		}
		return counter;
		
	}
	
	public static int[] getArray () {
		int[] returnArr = {3,5,7,9,9,7,7,5};
		return returnArr;
		
	}
	
	public static int[]getRandomArray (int size){
	Random rand = new Random();
	int [] nums = new int [size];
	for (int i = 0; i < size; i++) {
		nums [i] = rand.nextInt(101);
	}
	return nums;
	}
	
	
	
}


