package day12_switch_ternary;

import java.util.Scanner;

public class ClassWeather {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("What is the weather today?");
	
	String weather = scan.next().toLowerCase();
	
	switch(weather) {
	case "sunny":
	   System.out.println("Go to park");
	   System.out.println("Code Java");
	   break;
	case "hot":
	   System.out.println("Lets go swimming");
	   System.out.println("Code Java");
	   break;
    case "windy":
	   System.out.println("Fly a kite");
	   System.out.println("Code Java");
	   break;
	case "rainy":
	   System.out.println("Go shopping");
	   System.out.println("Code Java");
	   break;
    case "snow":
	   System.out.println("Change your tyries");
	   System.out.println("Code Java");
	   break;
    default:
	System.out.println("what are you talkig about! ");
	
	
}	
}
}
