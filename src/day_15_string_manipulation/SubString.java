package day_15_string_manipulation;

public class SubString {
public static void main(String[] args) {
	String sentence = "Java String manipulation is Fun!";
	System.out.println(sentence.substring(0, 4));
	
	//print string
	System.out.println(sentence.substring(5, 11));
	System.out.println(sentence.substring(7 , 11)); // ring
	System.out.println(sentence.substring(10 , 50)); // error
	
}
}
