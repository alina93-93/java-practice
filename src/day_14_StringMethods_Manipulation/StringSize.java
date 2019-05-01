package day_14_StringMethods_Manipulation;

public class StringSize {

	public static void main(String[] args) {
		String str1 = "Good morning";
		
		if (str1.contentEquals("Good morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not match");
		}
	
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match- ignore case");
		}else {
			System.out.println("Not match - ignore case");
		}
	// convert  to ALL uppercase and print
		
		System.out.println(str1.toUpperCase());
	System.out.println(str1);
	str1 = str1.toUpperCase();
	System.out.println("after assigment: "+str1);
	
	//combine the above methods together;
	//covert to all lowercase first then check if it equals ("good morning")
	
	
	    // good morning ==> good morning
	if (str1.toLowerCase().equals("good morning")) {
		System.out.println("Chained methods: match");
	}else {
		System.out.println("Chained methods: do not match");
		}
	
	// find out how many charecters in the string 
	
	String myName = "Angelina";
	System.out.println(myName.length());
	
	int length = myName.length();
	System.out.println("My name's length: "+ length);
	
	// username must be exactly 8 characters.
	//set some value and using a if statement check it is
	//8 characters: if true => valid user name. false => invalid
	
	String userName = "Pirozhok";
	if (userName.length() == 8 ) {
		System.out.println("Valid user name");
	}else {
		System.out.println("Invalid user name, must be 8 chars");
	}
			
			
	/// password must be at least 6 characters 
	
	String password = "woodenSpoon";
	
	
	
	//1)
	
	if(password.length()>6) {
		System.out.println("Password is good");
	}else {
		System.out.println("Password is too short");
	}
			
			int passwordLength = password.length();
			if (passwordLength <6 ) {
				System.out.println("Invalid password. Too short");
			}else {
				System.out.println("Valid password. Good job!");
				
				
				
				
				
				
				
				
			}
			
			
			
			
	
	
	
	
}
	
}