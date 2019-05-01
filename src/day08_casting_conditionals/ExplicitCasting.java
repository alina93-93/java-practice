package day08_casting_conditionals;

public class ExplicitCasting {
 public static void main(String[] args) {
System.out.println(10/2.0);	
	 //result is double 5.0 (because it is bigger)
	
	System.out.println(10.0/2); //= 5.0
	
	// int result = (int)(10/2.0); 
	
	int result = (int)(10/2.0);
	
	int rent1 = 987;
	int rent2 = 1100;
	int rent3 = 294;
	int rent4 = 1234;
	
	//double average = (rent1+rent2+rent3+rent4)/4; => 903.0
	
	double average = (double)(rent1+rent2+rent3+rent4)/4; //=> 903.75
	
	System.out.println(average);
	
	//in above statement both explicit and implicit casting happening.
	//explicit : double> byte 
	// implicit : byte > int 
	
	
}
}
