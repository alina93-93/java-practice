package day_39;

import java.util.*;

public class UniqueNums {
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<> ();
		// or List<int[][]>
		
		nums.add(10);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(8);
		nums.add(3);
		nums.add(4);
		nums.add(8);
		
		System.out.println(nums.size());
		System.out.println(nums);
		
		List<Integer> uni = new ArrayList<> ();
		
		for (Integer num : nums) {
			//assign num to unique if nums is not already there
			if(!uni.contains(num)) {
				uni.add(num);
			}
		}
		System.out.println(uni.toString());
		
		List <Integer> uni2 = new ArrayList<>();
		
		for (int i = 0; i< nums.size(); i++) {
			int count = 0;
			Integer value = nums.get(i);
			
			for (int k =0; k<nums.size(); k++) {
				if (nums.get(k) == value && i!= k) {
				count++;
				break;
			}
		}
		
	
		if (count == 0 ) {
			uni2.add(value);
		
		}
		
	}
	
	}
}
		
		