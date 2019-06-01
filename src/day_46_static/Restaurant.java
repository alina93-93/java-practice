package day_46_static;

public class Restaurant {
	public static void main(String[] args) {
		
	
	
	Dinner Mom = new Dinner ();
	Dinner kid = new Dinner ();
	Dinner Dad = new Dinner ();

	System.out.println("Total slices: "+Dinner.pizzaS); //8
	Dad.takeAS();//7
	kid.takeAS();//6
	Mom.takeAS();//5
	System.out.println("Total slices: "+Dinner.pizzaS); 
	System.out.println("Total slices: "+Dad.pizzaS); 
	
	kid.takeAS(3); //5-3 = 2
	Dad.takeAS(2);//2-2 = 0
	Mom.takeAS();
	
	System.out.println("Total slices: "+Mom.pizzaS);
	System.out.println("Total slices: "+Dinner.pizzaS);
}
	
}