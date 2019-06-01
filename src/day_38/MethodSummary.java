package day_38;
import java.util.*;
public class MethodSummary {
public static void main(String[] args) {
	List<String> list1 = new ArrayList<>();
	//add method to add value
	
	list1.add("red");
	list1.add("blue");
	list1.add("white");
	list1.add("grey");
	list1.add("black");
	//add method wit index : "yellow will be placed to index0"
	list1.add(0, "yellow");
	
	// otSring  method to print all values 
	System.out.println(list1.toString());
	
	//size method return number of values 
	System.out.println("Num of elements: "+list1.size());
	
	// get.method return value from index
	System.out.println("3: "+list1.get(3));
	
	//remove from using value/elements 
    list1.remove(0);
	System.out.println(list1.toString());
	
	list1.remove("blue");
	System.out.println(list1.toString());
	
	// set (index, value) replace index with new value
	list1.set(0, "orange");
	System.out.println(list1.toString());
	
	// indexOf (value) - return index of value inthe list
	System.out.println("grey: "+list1.indexOf("grey"));
	System.out.println("green: "+list1.indexOf("green"));
	
	//isEmpty() returns true if list is empty.size ==0
	System.out.println("Is list Empty: " +list1.isEmpty());
	System.out.println("Is list Empty: " +(list1.size() == (0)));
	
	//Contains(elem) 
	System.out.println("White is in the list: "+ list1.contains("white"));
	
	List<String> list2 = new ArrayList<>();
		//AddAll - adds all values from one list into another
		list2.addAll(list1);
		System.out.println("list2 "+list2.toString());
		
		//contains all, check if list has all values of another list 
		
		System.out.println("containsAll: "+ list1.containsAll(list2));
		//equals ; check if 2 list are exactly equal
		System.out.println("containsAll: "+ list1.equals(list2));
	
	list2.add("pink");
	//remove all matching values from ypur list 
	list2.removeAll(list1);
	System.out.println("list2 after removing: "+list2);
	System.out.println("List1: "+list1);
	System.out.println();
	
	//AddAll (index, list) adds a new values starting from given index
	list2.addAll(0, list1);
	System.out.println("List to after addALl: "+list2);
	
	list1.clear();
	list2.clear();
	System.out.println("both is empty - "+(list1.isEmpty() && (list2.isEmpty())));
	
	
	
}


}
