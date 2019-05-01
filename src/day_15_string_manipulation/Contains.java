package day_15_string_manipulation;

public class Contains {
	public static void main(String[] args) {
		
		String email = "test@gmail.com";
		System.out.println( email.contains("@"));
		
		String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";
		
		//check if apples is in the shopping list
		// true ==> Apples are there!
		//false ==> Lets add apples now!
		
		if (list.contains("apples")) {
			System.out.println("Apples are there");
		}else {
			System.out.println("Lets Add apples now");
		}
		
		boolean hasEggs  = list.contains("eggs");
		System.out.println("Contain eggs: "+hasEggs);
		
		boolean hasCucumbers = list.toUpperCase().contains("cucumbers");
		System.out.println("Contains cucumbers: "+hasCucumbers);
		
		if (email.contains("yahoo")) {
			System.out.println("its yahoo email");
		}else if (email.contains("gmail")) {
			System.out.println("Its gmail email");
		}else if (email.contains("hotmail")) {
			System.out.println("Its hotmail email");
		}
		
		String etsyTitle = "Wooden spoon | Etsy";
		if (etsyTitle.contains("  ") ) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
		
		// Assign your nsme and check it contains "a" or "e" letters
		
		String name = "angelina";
		if (name.contains("a") || name.contains("e")){
		System.out.println("'a' or 'e' is present");
		}else {
		System.out.println("'a' or 'e' is missing");
	}
		
		name.contains("a");
		
		
		
		
}
}