package day_42_cuatomclases_encapsulation;

public class Starbucks {
	public static void main(String[] args) {
		
		Coffe[] coffeeArray = new Coffe [2];
		coffeeArray[0] = new Coffe ();
		coffeeArray[0].setCoffeInfo("ESPESSO", "TALL",2.55,70);
		coffeeArray[0].getCoffeInfo();
		
		Coffe latte = new Coffe ();
		latte.setCoffeInfo("COFE LATTE", "TALL", 5.00, 250);
		coffeeArray[1]=latte;
		coffeeArray[1].getCoffeInfo();
	
		
		
		
	}

}
