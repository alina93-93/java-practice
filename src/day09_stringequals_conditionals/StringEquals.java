package day09_stringequals_conditionals;

public class StringEquals {
	public static void main(String[] args) {
	String str1 = "java";
	String str2 = "java";
	System.out.println(str1==str2); // true
		
	System.out.println(str1 == "java");	// true
		
	System.out.println(str2 == "Java");	// false
		
		
	System.out.println(str1.equals(str2));	// true 
	System.out.println(str1.equals("java")); // true
	System.out.println(str2.equals("Java"));	// false
		
		String month = new String ("March");
		String month2 = new String ("March");
		System.out.println(month == month2); // false 
		System.out.println(month.contentEquals(month2)); // true 
		System.out.println(month.contentEquals("March")); // true 
		
		
		
		
	}

}
