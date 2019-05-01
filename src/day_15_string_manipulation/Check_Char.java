package day_15_string_manipulation;

import java.util.Scanner;

public class Check_Char {
public static void main(String[] args) {
	
String emoji = ":(";
// ==, != check if it doesnt equal to 2 chars 
if (emoji.length() != 2 ) {
	System.out.println("invalid emoji");
	return; // exit stop execution 
} 
// if code reaches this point, then emoji is 2 chars
// get first and second chars and assign to variables

char first = emoji.charAt(0);
char second =  emoji.charAt(1);

if (first == ':') {
	if (second == ')') {
		System.out.println("smile");
	}else if (second == '(') {
		System.out.println("sad");
	}else if (second == '/') {
		System.out.println("upset");
	}else if (second == 'p') {
		System.out.println("playfull");
	}else {
		System.out.println("unknown emoji");
	}
		
}else if (first == ';') {
	if (second == ')') {
		System.out.println("wink");
	}else if (second == '0') {
		System.out.println("suprised");
	}else {
		System.out.println("unknown emoji");
	}
			
		
}else if (first == ')') {
	if (second == ':') {
		System.out.println("upsidown sad ");
	}else {
		System.out.println("unknown emoji");
	}
	
	
} else if ( first == '(') {
	if (second == ':') {
		System.out.println("upsidedown smile ");
	}else {
		System.out.println("unknown emoji");
	}

	
} else {
	System.out.println("Invalid emoji");
}


}
}
