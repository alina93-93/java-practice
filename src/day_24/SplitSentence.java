package day_24;

public class SplitSentence {
	public static void main(String[] args) {
		int counter = 0;
	String sentences = "Java is a general- purporse computer-programming" 
	+"language that is concurrren, class-based, object-oriented,"
	+ "and specifically designed to have as "
	+ "few implementation depemdencies as possibke.";
	
		String [] words = sentences.split(" ");
		for (String str : words) {
			if (str.equals("language")) {
				break;
			}
			counter++;
		}
		System.out.println("Position: "+counter);
		System.out.println(words [counter]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


