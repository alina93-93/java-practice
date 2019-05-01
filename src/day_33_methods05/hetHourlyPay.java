package day_33_methods05;

public class hetHourlyPay {
	public static void main(String[] args) {
		
		int pay = hp(40, 50);
		System.out.println("total pay for 40h "+pay);
		System.out.println(hp(0,10));
		int noPay = hp (10,0);
		System.out.println("noPay = "+noPay);
		
	}

	public static int hp (int hours, int rate ) {
		
		if( hours <= 0) {
			System.out.println("Invalid hours");
			return 0;
		}
		
		if (rate<=0) {
			System.out.println("Invalid rate");
			return 0;
		}
		
		int totalPay = hours*rate; 
		return totalPay;
		//System.out.println("end of the method");
		
	}
}
	
