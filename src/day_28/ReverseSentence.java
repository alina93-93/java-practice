package day_28;

import java.util.Arrays;

public class ReverseSentence {
 public static void main(String[] args) {
	
	 String sen = "You are very interesting person";
	 //split by space
	 
	 String [] arrSentence = sen.split(" ");
	 System.out.println("Number of words: "+arrSentence.length);
	 
	 System.out.println(Arrays.toString(arrSentence));
	 
	 String reversed = "";
	 
	 for (int i = arrSentence.length-1; i>=0; i--) {
		// System.out.println(arrSentence [i]);
		reversed+= arrSentence [i]+" ";
	 }
	System.out.println(reversed); 
}

}
