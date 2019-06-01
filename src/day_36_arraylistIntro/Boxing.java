package day_36_arraylistIntro;

public class Boxing {
	public static void main(String[] args) {
	
	//autoboxing is converting from 
		//primitive --> wrapper class object
		//convert from primitive to object
		
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		double d1 =  33.2;
		Double d2 = d1;
		Double d3 = 4.3;
		
		// unboxing 
		
		Double d11 =  new Double (34.2);
		double d22 = d1;
		System.out.println("d11: "+d11);
		System.out.println("d22: "+d22);
		
		long l1 = new Long (600000); // unboxing
		Long l2 = new Long (34543543L); // no boxing
		long l3 = l2; //auto - unboxing
		long l4 = l3; //auto - boxing
		
		Integer num3 = Integer.valueOf(345);
		
	
	}
}
