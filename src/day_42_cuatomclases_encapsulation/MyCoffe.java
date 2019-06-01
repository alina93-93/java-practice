package day_42_cuatomclases_encapsulation;

public class MyCoffe {
	public static void main(String[] args) {
		
		Coffe coffe1= new Coffe();
		coffe1.name = "ICED CARAMEL MOCHIATO";
		coffe1.size = "GRANDE";
		coffe1.price = 4.75;
		coffe1.calories = 500;
		
		coffe1.getCoffeInfo();
		
		Coffe coffe2 = new Coffe();
		coffe2.setName("JAVA CHIP");
		coffe2.size="VENTI";
		coffe2.price = 5.95;
		coffe2.calories = 600;
		
		coffe2.getCoffeInfo();
		
		Coffe coffe3 =  new Coffe();
		coffe3.setName ("ICED COFFE");
		coffe3.setSize("TALL");
		coffe3.setPrice(6.50);
		coffe3.setCalories(60);
		
		coffe3.getCoffeInfo();
		
		System.out.println("coffe3 name: "+coffe3.name);
		
		
		System.out.println();
		System.out.println("*******************************");
		System.out.println();
		
		Coffe coffe4 = new Coffe ();
		coffe4.setCoffeInfo("FLAT WHITE", "GRANDE", 5.00, 300);
		coffe4.getCoffeInfo();
		
		
	}
	

}
