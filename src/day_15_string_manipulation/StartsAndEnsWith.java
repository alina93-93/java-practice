package day_15_string_manipulation;

public class StartsAndEnsWith {
public static void main(String[] args) {
	
	String word1 = "eclipse";
	 //startsWith ==> test if starts with another string 
	
	System.out.println(word1.startsWith("e")); // ==> true
	System.out.println(word1.startsWith("ec"));
	System.out.println(word1.startsWith("ecli"));
	
	System.out.println(word1.startsWith("Ec"));
	
	
	System.out.println(word1.endsWith("e"));
	System.out.println(word1.endsWith("eclipse"));
	System.out.println(word1.endsWith(word1));
	
	//PSE = upper case
	
	System.out.println(word1.toUpperCase().endsWith("PSE"));
	
	// Mr. Mrs. Ms. Dr.
	String name = "Mr. Jackson";
	
	if (name.startsWith("Mr.")) {
		System.out.println("male gender");
	} else if (name.startsWith("Mrs.")){
	    System.out.println("Merried woman");
	} else if (name.startsWith("Ms.")) {
		System.out.println("Unknown woman status");
	} else if (name.startsWith("Dr.")) {
		System.out.println("Doctor");
	}
	
	

	
	
	
	
	
	
	
	
	
	
}
}
