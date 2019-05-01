package day_34_methods06;

import java.util.Arrays;

public class Recepi2_0 {
	public static void main(String[] args) {
		cook ("Burritto Bowl", "Rise", "Beans", "Meat", "Sour Cream" );
		cook ("Avocado Toast", "Sunny Side Eggs", "Toast");
		
		shoppingList (1000, "Avocado Toast", "Swatch Watch", "Shoes", "JAcket");
		shoppingList ( "MyPets", "cat Pushok", "cat Pryanik", "cat Monya ");
		
		
	}

	public static void cook (String name, String... ings) {
		System.out.println("Recepi for "+name);
		System.out.println(Arrays.toString(ings));
	}
	
	public static void shoppingList (int totalPrice, String ...items) {
		System.out.println("Total cost "+totalPrice);
		System.out.println(Arrays.toString(items));
	}
}
