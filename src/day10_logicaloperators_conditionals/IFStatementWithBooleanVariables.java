package day10_logicaloperators_conditionals;

public class IFStatementWithBooleanVariables {
	
	public static void main(String[] args) {
	boolean isBreakTime = false;
	
	if(isBreakTime == true) {
		System.out.println("break till 8:30");
	}else {
		System.out.println("not break time yet");
	}
		//second option
	
	if(isBreakTime) {
		System.out.println("break till 8:35");
	}else {
		System.out.println("not break time yet");
	}
		
	boolean classTime = false;
	
	if(classTime == true){
	System.out.println("Come back on time");	
	System.out.println("Stop talking");
	System.out.println("Pay attention");
	System.out.println("Code and have fun");
	
	}else {
		System.out.println("Take a walk and have some water");
	}
		
	boolean qualified = false;
	// send a notofication message if not qualified;
	// we need to check if  qualified variable  contains FALSE
	     
	if( qualified == false );
	System.out.println("You application wasn't approved.Thank you ");
	
	
	boolean isNiceWeather = true;

	if (!isNiceWeather) {      // its false because "!""

	System.out.println("Don't go out for running");
	}else{
		System.out.println("Lets go out for running");
	}
	
		
	}

}
