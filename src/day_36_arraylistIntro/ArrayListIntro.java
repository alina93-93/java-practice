package day_36_arraylistIntro;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class ArrayListIntro {
	public static void main(String[] args) {
		// create aarayList
		String [] str = new String[5];
		ArrayList <String> names = new ArrayList<>();
		int [] numsArray = new int [5];
		ArrayList <Integer> nums = new ArrayList<>(); 	
		// assign values into array list
		
		 names.add("Roman");
		 names.add("Orhan");
		 names.add("Vla");
		 names.add("Olomjon");
		 names.add("Natalia");
		 names.add("Maria");
		 
		 nums.add(100);
		 nums.add(99);
		 nums.add(656);
		 
		 // read from array list 
		 
		 System.out.println(names.get(0));
		 System.out.println(names.get(1));
		 System.out.println(names.get(2));
		 
		 System.out.println("Names count "+names.size());
		 System.out.println("Nums count "+nums.size());
		 
		 
	}

}
