package day_41_customclasses02;

public class MyCars {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.make="Rio";
		car1.model="Kia";
		car1.color="Gold";
		car1.curentSpeed=75;
		
		car1.showCurrentSpeed(55);
	car1.drive();
	System.out.println("before "+car1.curentSpeed);
	car1.accelerate(20);
	System.out.println("after "+car1.curentSpeed);
		
	
	BMW bmw = new BMW ();
	System.out.println(bmw.make);
	bmw.model= "740i";
	bmw.showPrice ();
	
	System.out.println("Car Price is: "+bmw.price);
	
	BMW bmw2 = new BMW();
	bmw2.model = "X3";
	bmw2.showPrice();
	
	
		}
	}