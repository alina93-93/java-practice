package day_38;

import java.util.ArrayList;

public class RawArrayList {
	public static void main(String[] args) {
		
	
	ArrayList list = new ArrayList();
	list.add("Saturday");
	list.add("Java Day");
	list.add(1000);
	list.add(234.4);
	list.add(true);
	list.add(false);
	
	System.out.println(list);
	String allValues = list.toString();
	System.out.println(allValues);
	
	String str = (String) list.get(0);
	// or String str = list.get(0).toString();
	System.out.println(str);
	//Integer i = (Integer) list.get(0); 

	
	// all values are stored as a raw type. we can also call it General Object type
	
	
	

	
	
}
}