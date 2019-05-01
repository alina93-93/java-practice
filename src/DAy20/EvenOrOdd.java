package DAy20;

public class EvenOrOdd {
	public static void main(String[] args) {
	//if statements
		//using for loop
		//1. print all even numbers in same line
		
	for (int n = 1; n <= 100; n++) {
		if(n % 2 ==0) { // check if its even
			System.out.print(n+" ");
			
		}
	}
		System.out.println();
		//2. print all odd numbers in same line
	for ( int j = 1; j<=100;j++) {
		if (j%2 != 0 ) {
			System.out.print(j+" ");
		}
	}
		//3. sumOfOdds, sumOfEvens-calculate
	
	int sumOfOdds = 0;
	int sumOfEven = 0;
	for  (int num = 1; num <= 100; num++) {
		if (num %2 == 0) {
		sumOfEven += num;	
	}else {
		sumOfOdds += num;
		
	}
		//and print out after the loop

	}	
	System.out.println();
	
	
	System.out.println("SumOfEven: "+sumOfEven );
	System.out.println("SumOfOdds: "+sumOfOdds);
	}
}
