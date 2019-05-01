package day_23;

public class PrintNumbersWithLoop2 {
	public static void main(String[] args) {
		//outer loop
		for (int j= 10; j >= 1; j--) {
			//inner loop
		for ( int i = j; i <= 1; i--) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		}
	}

}
