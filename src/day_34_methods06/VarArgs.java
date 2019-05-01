package day_34_methods06;


public class VarArgs {
	public static void main(String[] args) {
		printWords("red", "blue");
		printWords("grey");
		printWords();
		
		
		System.out.println(sum(3, 5, 10));
		
		int budget = 200;
		if (sum(10,45, 110, 30) <= budget) {
				System.out.println("Within budget");
			}else{
				System.out.println("Broke");
			}
		
		int total = sum(234, 43,567, 12, 34, 5);
				System.out.println("Total Summa is "+ total);
		}

	public static void printWords(String... words ) {
		 // handle it like an Array
			for(String w: words) {
				System.out.println(w);
			}
	
	}
	
	public static int sum (int...nums) { // varargs 
		
		int sum = 0;
   for (int n :nums) {
	   sum+=n; // sum= sum+n
	   
	   
   }
		return sum;
		
	}

}
