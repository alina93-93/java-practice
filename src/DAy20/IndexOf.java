package DAy20;

public class IndexOf {
	public static void main(String[] args) {
		String word = "Amazon";
		System.out.println(word.indexOf("z"));
		word = word.toLowerCase();
		char letter = 'z';
		int index = -1;
		
		System.out.println(word.indexOf(letter));
		// for loop 
		
		for (int i = 0; i<= 10; i++) {
			System.out.println(i);
			if (i== 5) {
				break; // exit the loop
			}
		}
		System.out.println("==============================");
		// using loop = look for letter
		// if exit is a match assign value to index 
		//exit for loop 
		// print value of index
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i)==letter) {
			   index = i;
			   break;
			}
		
		}
		System.out.println("Index: "+index);
	}

}
