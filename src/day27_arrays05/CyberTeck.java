package day27_arrays05;

import java.util.Arrays;

class CyberTeck {
public static void main(String[] args) {
	
	String url = "https://learn.cybertekschool.com/courses/149";
	String[]  urlArr = url.split("/");
     System.out.println("Length:" +urlArr.length);
     
     System.out.println(urlArr[urlArr.length-1]);
     
     int courseId =  Integer.parseInt(urlArr[4]);
     
		switch(courseId) {
		case 143:
			System.out.println("Welcome Kit!");
			break;
		case 144:
			System.out.println("Team Activity");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 147:
			System.out.println("JAVA Programing");
			break;		
		case 152:
			System.out.println("QA Testing");
			break;
		case 204:
			System.out.println("VA Mentoring");
			break;
			default:
				System.out.println("Invalid Last IDX");
		}
		
     
     
     
     
	
	
	
	
}
}
