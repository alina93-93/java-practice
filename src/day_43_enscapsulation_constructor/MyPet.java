package day_43_enscapsulation_constructor;

public class MyPet {
	public static void main(String[] args) {
		
		Pet pet1 = new Pet ("Dog", "Buch");
		Pet pet2 = new Pet ("Cat", "Monya");
		Pet pet3 = new Pet ("Fish", "Dori");
		Pet pet4 = new Pet ("Goat", "Kozlic");
		Pet pet5 = new Pet ("Cat", "Burger");
		Pet pet6 = new Pet ("Bird", "Kevin");
		
		pet1.speak();
		pet2.speak();
		pet3.speak();
		pet4.speak();
		pet5.speak();
		pet6.speak();
		
		System.out.println(pet1.toString());
		System.out.println(pet2.toString());
		System.out.println(pet3.toString());
		System.out.println(pet4.toString());
		System.out.println(pet5.toString());
		System.out.println(pet6.toString());
		
	}
}
