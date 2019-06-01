package day_36_arraylistIntro;

import java.util.ArrayList;

public class ArrayListExp {
public static void main(String[] args) {
	//declare array list called languages

	ArrayList <String> languages = new ArrayList<>();
	languages.add ("java");
	languages.add ("English");
	languages.add ("Spanish");
	languages.add ("Spanish");
	languages.add ("Arabic");
	languages.add ("Russian");
	languages.add ("Azerbaijani");
	languages.add ("Ukrainian");
	
	//language.add(true);
	
	System.out.println("Number of values : "+languages.size());
	languages.add("Turkish");
	System.out.println("Number of values : "+languages.size());
	
	//remove
	
	languages.remove(0);
	System.out.println("Number of values : "+languages.size());
	System.out.println(languages.toString());
	
}
}
