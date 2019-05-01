package day_16_string_manipulation;

import java.util.Scanner;

public class url {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter url");
	String url = scan.next();
	
	//check www.
	
	if (url.startsWith("www.")) {
		System.out.println("www. is present");
	}else {
		System.out.println("Invalid url");
		return;
	}
	
	//check. is there right before extension
	//find out the lenght of the url 
	//do -4 and using chartA get the character 
	//compare if it is "."
	//www.etsy.com ==> lengh is 12 here
	
	
	int dotIndex = url.length()-4; 
	//url.lastIndexOf('.');
	
	if (url.charAt(dotIndex)== '.') {
		System.out.println(" . is there before extension");
	} else {
		System.out.println(" . may be displyed");
	}
	
/*
 * if (url.charAt(url.lenght()-4) == '.'){
 * }
 */
	// get domain and extansion
	
	
	
	
     String domain = url.substring(4, dotIndex);
     System.out.println("Domain is: "+domain);
     
     String extension = url.substring(dotIndex+1, url.length());
     System.out.println("Extension is: "+extension);

}
}

