package day_31;

import java.util.Arrays;

public class MethodsWithString {
	public static void main(String[] args) {
		countWords ("Java is fun");
		googleSearchResults = ("About 26,600,000 result (0.73 seconds)");
		
	}

	public static void countWords (String sentence) {
		String [] words = sentence.split(" ");
		
		System.out.println("words in this sentences: "+Arrays.toString(words));
        System.out.println("Count of words "+words.length);
	}
	
	public static void googleSearchResults (String result) {
		// split by to array
		String [] words = result.split(" ");
		String count = words[1].replace(",", " ");
		String seconds = words[3].replace("(", " ");	
		
		
		
		
		
	}
	
}
