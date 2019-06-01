package day_38;

import java.util.*;

public class RemoveAll {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(30); list1.add(40); list1.add(50); list1.add(60);
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(30); list2.add(40); list2.add(50); list2.add(60);
		list2.add(70); list2.add(80); list2.add(90); list2.add(100);
		list2.add(200); list2.add(300); 
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println();
		
		//remove all matching values from list1
		list2.removeAll(list1);
		System.out.println(list2);
		
		
	}

}
