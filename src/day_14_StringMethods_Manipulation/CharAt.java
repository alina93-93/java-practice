package day_14_StringMethods_Manipulation;

public class CharAt {
	public static void main(String[] args) {
	String word = "Computer";
	//print all characters one by one 
	System.out.println(word.charAt(0));
	System.out.println(word.charAt(1));
	System.out.println(word.charAt(2));
	System.out.println(word.charAt(3));
	System.out.println(word.charAt(4));
	System.out.println(word.charAt(5));

	
	//create a string word2 and chek if first character is 'J'
	
	String word2 = "Java";
	
    if(word2.charAt(0)== 'J') {
	System.out.println("J is a first char");
}else {
	System.out.println("J is not a first ");
}

    //string word3 that consist of 5 characters
    //check if first and last charecters are the same 
    //true ==> "first and last match 
    // false they are different 
    
    String word3 = "civic";
   char first = word3.charAt(0);
   char last = word3.charAt(4);
   
   if (first == last) {
	   System.out.println("First and last match");
   }else {
	   System.out.println("Dont match");
   }
	
	
	/// strings word4 
   ///always print the last character no matter the length 
   
   String word4 = "java";
   char lastChar = word4.charAt(word4.length()-1);
   System.out.println("Last value of "+word4+" is "+lastChar);
   
   
   
   
   
   
   
   
   
	
	
	
	}

}
