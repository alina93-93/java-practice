package day_16_string_manipulation;

public class TrimSpaces {
	public static void main(String[] args) {
		String word1 = " String methods ";
		System.out.println(word1.trim()); // without spases at beginning & at an the end
		System.out.println(word1);
		
		String word2 = "  Here are Three spaces at the begining and at an the end   ";
		System.out.println(word2.trim());
		System.out.println(word2);
	}

}
