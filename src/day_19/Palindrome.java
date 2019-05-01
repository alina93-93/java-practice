package day_19;

public class Palindrome {
	public static void main(String[] args) {
		String word = "Civic";
		String reversed = "";
	//loop though the word and 
		// concatanate each character to reversed string 
		// compare if word and reverese are equal
	
		int index = 0;
		while (index < word.length()){
			System.out.print(word.charAt(index));
			index++;
		}
	
		System.out.println();
		System.out.println();
		
		int indexForRverse = word.length()-1;
		while (indexForRverse >= 0) {
			System.out.print(word.charAt(indexForRverse));
			indexForRverse--;
		}
		
		System.out.println();
		System.out.println("=============================");
		
		int idx = word.length()-1;
		while ( idx >=0 ) {
			reversed = reversed + word.charAt(idx);
			idx--;
			
		}
		
		System.out.println(reversed);
		// compare if word and reverese are equal
		//if (reversed)
		
		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("it is palindrome");
		}else {
		System.out.println("its not palindrome");
		
		}
		
	}

}
