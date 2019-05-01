package day_15_string_manipulation;

public class IndexOf {
	public static void main(String[] args) {
	                   //0123456
		String word1  = "github7";	
	System.out.println(word1.indexOf('b'));	
	System.out.println(word1.indexOf("th"));	
	System.out.println(word1.indexOf("hub"));	
	System.out.println(word1.indexOf("aba"));	// everytime "-1" when canot find given sybols 
		        //0123456789
	String url = "www.okta.comm";
	int index = url.indexOf(".");
	System.out.println("Position of . : "+index);
	System.out.println(url.charAt(index+1)); // index it is ( dot) "." .. 3 third position/  at that reason plus one will be next symbols (its letter "o")	
		
	String title = "Java-Google Search ";
	// find position of '-' and check if space
	//is on right and left sides 
		
	int dash = title.indexOf('-');
	System.out.println(title.charAt(dash-1));
	System.out.println(title.charAt(dash+1));
	System.out.println(title.charAt(dash-2));
	
	String country = "United States";
	int states = country.indexOf("States");
	System.out.println("Position of states : "+states);
	
	String word2 = "java, c++, python, tomcat, eclipse";
	// check if c++ is in the word2
	//1) using contains
	if (word2.contains ("c++")) {
		System.out.println("c++ is there");
	}else {
		System.out.println("c++ is not there");
	}
	//2) using indexOf
	if ( word2.indexOf("c++") != -1 ) {
	System.out.println("c++ is there");
	}else {
		System.out.println("c++ is not there");
	}
	
	
	
	
	
	}

}
