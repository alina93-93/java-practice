package day_22_loops_practice;

public class LookForWordInTheString {
	public static void main(String[] args) {
	
		String sentences = "He said hi, then she replied hi. hi guys!";
		// print letters in pairs 
		
		//He
		//e _
		//_s
		//ai
		//d_
		// check if temp equals "hi", if true, add 1 to count
		int count = 0;
		for (int i = 0; i< sentences.length()-1; i++) {
			String temp = sentences.substring(i, i+2); // 2 letters
			if (temp.equals("hi")) {
				count++;
			}
			
		}
		
		System.out.println("Count: "+count);
		
		
		
		
		
		
		
		
		
	}

}
