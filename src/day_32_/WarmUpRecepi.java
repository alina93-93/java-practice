package day_32_;

public class WarmUpRecepi {
	public static void main(String[] args) {
		makePancake ();
		makePasta();
		cook ("Omlette", "Eggs, Salt, Tomatoes, Peppers, Onions");
	}
	
	public static void cook (String dish, String ingridients) {
		System.out.println();
		System.out.println("~ ~ "+dish.toUpperCase()+" RECIPE ~ ~");
		add (ingridients);
		System.out.println("Coock it");
		System.out.println("~ ~ "+dish.toUpperCase()+" IS READY ~ ~");
		
	}
	
	public static void makePancake () {
		System.out.println("~ ~ Pancake recipe ~ ~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("Enjoy this tasty pancakes");		
		System.out.println();
	}
	
	public static void makePasta() {
		System.out.println("~ ~ Italian pasta recepi ~ ~");
		add ("Water, Salt, Olive oil");
		boil(2);
		add("Spaggetti");
		boil(10);
		mix(60);
		System.out.println("Bon Apetite");
	}

	public static void add (String ing) {
		
		System.out.println("Add "+ing);
	
	}
	
	public static void mix  (int seconds) {
		
		System.out.println("Mix for "+seconds);
		
	}
	
	public static void fry (int min) {
		System.out.println("Fry for "+ min);
	}
	
	public static void boil (int min) {
		
		System.out.println("Boil for "+ min);
	}
}
