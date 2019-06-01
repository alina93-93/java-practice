package day_37_arrayList;

import java.util.ArrayList;

public class Shopping {
public static void main(String[] args) {
	
	ArrayList <String> shoppingList = new ArrayList<>();
	
	shoppingList.add("pants");
	shoppingList.add("t-shirt");
	shoppingList.add("dress");
	shoppingList.add("swim suit");
	shoppingList.add("ramper");
	shoppingList.add("sambrero");
	
	//print number of item
	int count = shoppingList.size();
	
	System.out.println("Total count: "+count);
	System.out.println(shoppingList.toString());
	System.out.println("First item is "+shoppingList.get(0)+ "\nLast item is "+shoppingList.get(count-1));
	
	shoppingList.remove(0); // shoppingList.remove ("pants");
	System.out.println(shoppingList);
	System.out.println(shoppingList.toString());
	System.out.println(shoppingList.get(0));
	shoppingList.remove(0);
	System.out.println(shoppingList.toString());
	
	for (String item : shoppingList) {
		System.out.println(item); 
	}
	
	//remove all items at once
	shoppingList.clear();
	System.out.println(shoppingList.toString());
}
}
