package day08_casting_conditionals;

public class CastingPrimitives {

	public static void main(String[] args) {
	
		// cast double value to int
		
		int i = (int)3.4;
	    System.out.println("i: "+i);
	
	double price = 230.50;
	int dollars = (int) price ;
	
	
	System.out.println("Price: "+price);
	System.out.println("Dollars: "+dollars);
	
	
	//Whole num's , byte , short, int 
	
	int count = 244;
	byte byteCount = (byte)count; 
	System.out.println("ByteCount: "+ byteCount);
	
	// you will have unexepted result because byte is only = 128 everything what is more
	// will be confusing for java.
	
	
	long longValue = 345645L;
	int intValue = (int)longValue;
	
	System.out.println(intValue);
	
	int large = 5767;
	short small = (short) large;
	System.out.println(small);
	
	 //250              //250   250.2
	int result = (int)(500.4 / 2.00);
	System.out.println("Result: "+result);
	
	
	
	
	
	
	
	
	
	
			
	
	
	
	
		
}
}
