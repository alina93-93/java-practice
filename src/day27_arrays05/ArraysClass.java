package day27_arrays05;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		
		int[] nums = {43, 12, 4, 1,3, 5};
		//toString method
		
		System.out.println(Arrays.toString(nums));
	
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		//sort method 
		
		Arrays.parallelSort(nums);
		System.out.println(Arrays.toString(nums));
		
		
		 String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic","Uzbek"};
         System.out.println(Arrays.toString(languages));
		 Arrays.parallelSort(languages);
		 System.out.println(Arrays.deepToString(languages));
		 
		 
		 int[] nums2 = {345, 665, 3333, 11, 1, 66};
		 // lowest and largest value
	    Arrays.sort(nums2);
	    int lowest = nums2[0];
	    int largest = nums2[nums2.length-1];
	    System.out.println("lowest is "+lowest);
		System.out.println("largest is "+largest);
	}

}
