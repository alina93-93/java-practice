package day_37_arrayList;

import java.util.ArrayList;

public class MyCities {
	public static void main(String[] args) {
		
		ArrayList <String> cities = new ArrayList<>();
		
		cities.add("Kyiv");
		cities.add("Silver Spring");
		cities.add("Paris");
		cities.add("Berlin");
		cities.add("ROma");
		cities.add("Kyiv");
		
		// print each of c usinf for each loop
		
		for (String city : cities) {
			System.out.print(city+" ");
		}
		System.out.println();
	
	
	for (int i = 0 ; i <cities.size(); i++) {
		System.out.print(cities.get(i)+" ");
	}
	// remove Kyiv
	System.out.println();
	cities.remove("Kyiv");
	System.out.println(cities.toString());
	cities.remove("Kyiv");
	System.out.println(cities.toString());
	
	//is Empty
	
	System.out.println("Is list empty? "+cities.isEmpty());
	cities.add(1,"Toronto");
	System.out.println(cities.toString());

	cities.set(0, "Austin");
	System.out.println(cities.toString());
	
	int idx = cities.indexOf("Paris");
	System.out.println("Paris index is: "+idx);
	cities.set(idx, "Denmark");
	System.out.println(cities.toString());
	
	cities.clear();
	boolean empty = cities.isEmpty();
	System.out.println("is it Empty: "+empty);

}
}
