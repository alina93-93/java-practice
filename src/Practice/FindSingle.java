package Practice;

public class FindSingle {
	// Find non repeating  
	// number in an array  
	static int findNonRepeating(int []nums, int n) 
	{ 
	    int res = 0; 
	    for (int i = 0; i < n; i++) 
	        res = res ^ nums[i]; 
	    return res; 
	} 
	  
	// Driver Code 
	static public void main (String[] args) 
	{ 
	int []nums = {3, 10, 3, 2, 2, 1, 1}; 
	int n = nums.length; 
	System.out.println(findNonRepeating(nums, n)); 
	} 
	

}