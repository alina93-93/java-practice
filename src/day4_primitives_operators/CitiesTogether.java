package day4_primitives_operators;

public class CitiesTogether {
public static void main(String[] args) {
//Declare 3 String variables
//	city1
//	city2
//	city3
	
//Assign values:
//	Tashkent
//	Kyiv
//	Moscow
//Print : from Tashkent to Kyiv is $500
	    //from Moscow to Tashkent $550
	    //I have been in Tashkent, Moscow, Kyiv.
	
	String city1 = "Tashkent";
	String city2 = "Kyiv";
	String city3 = "Moscow";

	System.out.println("From " +city1+ " to " +city2+ " $500");
	System.out.println("From " +city3+" to " +city1+ " $550");
	System.out.println("I have been in " + city1 + " "+ city2+ " " + city3+ "");		
	
	String app = "Slack";
	
	//We use <Slack> for messaging with Classmates
	
	System.out.println("We use " +app+ " for messaging with Classemate");
	
	app = "Skype" + " and Slack";
	System.out.println("We use " +app+ " for messaging with Classemate");
		
}
}


