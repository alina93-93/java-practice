package day_38;
import java.util.*;
public class EqualsMethod {
	public static void main(String[] args) {
		
	
List<String> friends1 = new ArrayList<>();
List<String> friends2 = new ArrayList<>();

friends1.add("Roman");
friends1.add("Natalia");
friends1.add("Orhan");
friends1.add("Elya");
friends1.add("Dima");

friends2.add("Dima");
friends2.add("Elya");
friends2.add("Orhan");
friends2.add("Natalia");
friends2.add("Roman");

System.out.println(friends1);
System.out.println(friends2);

if (friends1.equals(friends2)){
	System.out.println("Same friends");
}else {
	System.out.println("You have different friends");
}

}


	
}