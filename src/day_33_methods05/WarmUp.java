package day_33_methods05;

public class WarmUp {
	public static void main(String[] args) {
		addVoid (2,5); // void method just perform action 
		int result = add (4,8);
		System.out.println("result is: "+result);
		 result = add (30,80);
			System.out.println("result is: "+result);
			
			double multy = multiply (5, 7);
			System.out.println("multyply is: "+multy);
			
			double min = minus (10, 3);
			System.out.println("result (minus) is: "+min);
		
			double dev = devide (9, 0);
			System.out.println("result (devide) is: "+dev);
	}

public static void addVoid (int num1, int num2) {
	int sum = num1 + num2;
	System.out.println("Sum is: "+sum);
}
	public static int add (int num1, int num2) {
		int sum = num1+ num2;
		return sum;	
		
	}
	
	public static double multiply ( double num1, double num2) {
		double multy = num1 * num2;
		return (multy);
	}
	
	
	public static double minus(double num1, double num2) {
		double min = num1 - num2;
		return(min);
	}
	
	public static double devide (double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Error : num can not be / by 0");
			return 0;
			//System.exit(0);
		}else {
			
		double dev = num1 / num2;
		return (dev);
	}
	}
	
}
