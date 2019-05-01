package day18_while_dowhile_loops;

public class Counter1 {
	public static void main(String[] args) throws InterruptedException {
		
		//12345678910
		
		int num = 1;
		
		while ( num <= 10) {
			System.out.print(num+", ");
			num++;
			Thread.sleep(50);
		}
		
		System.out.println("\nNum value after loop: "+num);
		
		// 11 10 9 8 7 6 5 4 3 2 1
		
		int num2 = 11;
		
		while(num2 >= 1 ) {
			System.out.print(num2+ ", ");
			num2--;
			Thread.sleep(456);
		}
		System.out.println("Num2: " + num2);
		
		
		
		
		
	}

}
