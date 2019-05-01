package day_19;

public class PrintLetters {
	public static void main(String[] args) {
	String word = "Amazon";
	             //012345 (last character has index 5 

	// print each character one by one in separate lines
	//System.out.println(word.charAt(idx));    A
	//idx++;
	//System.out.println(word.charAt(idx));     M
	//idx++;
	//System.out.println(word.charAt(idx));	     A
	//idx++;
	//System.out.println(word.charAt(idx));	    Z
	//idx++;
	//System.out.println(word.charAt(idx));   O
	//idx++;
	///System.out.println(word.charAt(idx));   N
	
	
	int idx = 0;
	while (idx < word.length()) {
		System.out.println(word.charAt(idx));
		idx++;
	}
		// print each  character in reverse order
	
	int idx2 = word.length()-1; // index # 5 , last character
	
	while (idx2 >= 0 ) {
		System.out.println(word.charAt(idx2));
		idx2--;
	}
		
		
	
	
	

	
		
		
	}

}
