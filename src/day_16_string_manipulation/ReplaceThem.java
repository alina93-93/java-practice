package day_16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		System.out.println(sentence);
		// replace < with !!
		
		sentence = sentence.replace(",","!!");
		System.out.println(sentence);
		
		String mixed = "&^@#j$a-vla@#$";
		// clean up mixed
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "" );
		System.out.println(mixed);
		mixed = mixed.replace("$", "");
		System.out.println(mixed);
	    mixed = mixed.replace("-", "");
		System.out.println(mixed);
		mixed = mixed.replace("l", "");
		System.out.println(mixed);
		// or mixed = mixed.replace("", "").replace("&^@#", "").replace("-", "");
		
		System.out.println("----------------------------------");
		
		String result = "About 115,000,000 results (0.59 seconds)";
		// using string methods (replace, substring ) get number of results
		//115,000,000
		result = result.replace("About ", ""); // 115,000,000 results (0,11)
		result = result.substring(0, result.indexOf(" "));
		
		System.out.println(result);
		
		System.out.println("----------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
