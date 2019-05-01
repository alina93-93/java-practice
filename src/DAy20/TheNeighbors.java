package DAy20;

import java.util.Scanner;

public class TheNeighbors {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the word");
				
		String word = scan.next();
		// aabsdd if character and next one are sane print:
		// beeep - a
		// beeep - d
		// or silance
		                  // aabsdd -i < 5 
		for (int i =0 ; i<word.length()-1; i++) {
			if (word.charAt(i) == word.charAt(i + 1) ) {
				System.out.println("Beeep - "+word.charAt(i));
			}
		}
		
		
		
	}

}
