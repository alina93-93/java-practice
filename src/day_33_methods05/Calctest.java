package day_33_methods05;

import day_33_methods05.WarmUp;

public class Calctest {
	public static void main(String[] args) {
		
		System.out.println(WarmUp.add(3, 1));
		System.out.println(WarmUp.multiply(3, 1));
		System.out.println(WarmUp.minus(3, 1));
		System.out.println(WarmUp.devide(3, 1));
		
		int addResult = WarmUp.add(21, 41);
		double mResult = WarmUp.multiply(50, 40);
		double miResult = WarmUp.minus(300, 200);
		double dResult = WarmUp.devide(455, 5);
		
		System.out.println("add Result: "+addResult);
		System.out.println("multiply Result: "+mResult);
		System.out.println("minus Result: "+miResult);
		System.out.println("divide Result: "+dResult);
		
		double a = 10.0, b = 5.0;
		double myResult = WarmUp.minus(a, b);
		System.out.println("myResult: "+myResult);
		
		double [] dNums = {2.0, 4.0};
		double result2 = WarmUp.multiply(dNums[0], dNums[1]);
		System.out.println("result2 : "+ result2);
		
		if (WarmUp.add(10, 16)==26) {
			System.out.println("Add Unit Test Passed");
		}else {
			System.out.println("Add Unit test failed");
		} 
		String str = "java";
		if (str.length()==4) {
			System.out.println("It is 4 characters");
		}else {
			System.out.println("It is not for characters");
		}
	}

	
	

}
