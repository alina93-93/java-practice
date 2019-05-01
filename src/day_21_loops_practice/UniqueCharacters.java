package day_21_loops_practice;

public class UniqueCharacters {
public static void main(String[] args) {
	String word = "javva";
	String unique = "";
	
    char ch = word.charAt(0);
	System.out.println(unique.contains(""+ch));
	
	if (!unique.contains(""+ch)) {
		unique += ch; // unique = unique + ch
	}
	
	System.out.println("Unique: "+unique);
	
	
	if (unique.indexOf(ch)== -1) {
		unique += ch ; // "ab" // or unique = unique + ch;
	}
	
	System.out.println("=====================");
	
	
	String word2 = "bananas";
	String unique2 = "";
		
	int i = 1;
	char ch2 = word2.charAt(i);
	System.out.println("Ch2:"+ ch2);
	
	i ++;
	ch2 = word2.charAt(i);
	System.out.println("Ch2:"+ ch2);
	
	
	
	
	
	
	
}
}
