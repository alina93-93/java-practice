package Practice;

public class Arrays {
	public static void main(String[] args) {
		int [] nums = new int[] {1, 1, 4, 6, 7, 12};
		int [] nums2 = new int[] {1, 4, 6, 3, 7, 12};
		int [] nums3 = new int[] {433, 12, 5};
		
		isArraySorted(nums);
		isArraySorted(nums2);
		isArraySorted(nums3);
		isArraySorted(new int[] {10, 33}) ;
		
		boolean sorted = true;
		
		for (int i = 0; i<nums.length-1; i++) {
			System.out.println(nums[i]+" "+nums[i+1]);
			if (nums[i]>nums[i+1]) {
				sorted = false;
				break;
			}
		
			
		}
		System.out.println("Array is sorted? "+sorted);
        
		sorted = true;
		
		for (int i = 0; i<nums2.length-1; i++) {
			System.out.println(nums2[i]+" "+nums2[i+1]);
			if (nums2[i]>nums2[i+1]) {
				sorted = false;
				
				break;
			}
		
			
		}
		System.out.println("Array is sorted? "+sorted);
	}
	/*
	 * Method accepts array of ints
	 */
	
	public static void isArraySorted(int[]nums) {
		
boolean sorted = true; //local variable
		
		for (int i = 0; i<nums.length-1; i++) {
			System.out.println(nums[i]+" "+nums[i+1]);
			if (nums[i]>nums[i+1]) {
				sorted = false;
				break;
			}
		
			
		}
		System.out.println("Array is sorted? "+sorted);
        
	}

	public static int toString(int[] nums) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	}
