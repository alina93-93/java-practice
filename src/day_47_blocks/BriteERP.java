package day_47_blocks;

import java.time.LocalDateTime;

public class BriteERP {
	
	static { // automatically runs
		System.out.println("Launch browser");
		System.out.println("Navigate to: "+ TestData.url);
		// static block runs Once automatically whenever the class is used (creating obj , call static method)
		//static block runs whenever a class is LOADED for use
		// CLASSLOADER!!!!!!
		
	}
	
	public static void enterEmail () {
		System.out.println("Enter emai: "+TestData.email);
	}

	public static void enterPassword () {
		System.out.println("Enter password: "+TestData.password);
	}
	
	public static void verifyLogin () {
		System.out.println("Expected name: "+TestData.userName);
		System.out.println("Actual Name displayed: Angelina");
		System.out.println("Login Successful - "+LocalDateTime.now());
		
	}
	
	
}
