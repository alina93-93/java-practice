package day_23;

public class loopThrougTheNum {
	public static void main(String[] args) {

		for ( int i = 0; i <= 50; i++) {
			if (i %20 ==0) {
				continue;
			}
			if(i%5 == 0) {
				break;
			}
			System.out.print(i + ",");
		}
		
		
		
		
		
		
		
	}

}
