package day18_while_dowhile_loops;

public class Alphabet {
	 public static void main(String[] args) {
		
		 char letter = 'a';
		 System.out.println(letter);
		 letter++;
		 System.out.println(letter);
		 letter++;
		 System.out.println(letter);
		 letter++;
		 System.out.println(letter);
		 letter++;
		 System.out.println(letter);
		 letter++;
		 System.out.println(letter);
		 // a b c d e 
		 
		 char letter1 = 'a';
		 while (letter1 <= 'z') {
			 System.out.print(letter1); 
			 letter1++;
		 }
		 
		 char capitals = 'A';
		 System.out.println();
		 while (capitals <='Z') {
			 System.out.print(capitals+" ");
			 capitals++;
			 
		 }
		 
	// print lower case
		System.out.println();
		 System.out.println("---------------------------------------------");
		 
		 char reverse = 'z';
		 
		 while (reverse >= 'a') {
			 System.out.print(reverse+" ");
			 reverse--; 
		 }
	
		 System.out.println();
		 String letters = "";
		 letters = letters+'A';
		 System.out.println(letters);
		 
		 letters = letters + 'B' ;
		 System.out.println(letters);
		 
		 
		 letters = letters + 'C' ;
		 System.out.println(letters);
		 
		 letters = letters + 'D' ;
		 System.out.println(letters);
		 
		 letters = letters + 'F' ;
		 System.out.println(letters);
		 
		 
		 System.out.println();
		 
		  String letters1 = "";
		 char myLetter = 'A';
		 
		 while (myLetter <= 'Z') {
			 letters1 = letters1 + myLetter;
					 
			 System.out.println(letters1);
			 myLetter++;
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
