package day_19;

public class D0WhileRunsOnce {
	public static void main(String[] args) {
		/// in this exp, do while loop body code will run ///once the condition. then exit the loop, 
		//when condition is false
		
		int count = 10;
		do {
			System.out.println("Count: "+count);
			count++;
		}while (count <=5 );
	}

}
