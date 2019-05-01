package day27_arrays05;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		int [] nums = {4, 6, 7, 10, 55};
		System.out.println(Arrays.binarySearch(nums, 7));
		System.out.println(Arrays.binarySearch(nums, 55));
		System.out.println(Arrays.binarySearch(nums, 5));
		
		int i = Arrays.binarySearch(nums, 10);
	    System.out.println(i);
		
		int[] nums2 = {40, 6, 17, 10, 55};
		Arrays.parallelSort(nums2);
	    System.out.println(Arrays.binarySearch(nums2, 40));
	// Arrays.binarySearch(a, fromIndex, toIndex, key)
	 //   Arrays.binarySearch(a, fromIndex, toIndex, c) ; comparator
	
	
	
	
	
	}

}
