package day_43_enscapsulation_constructor;

public class TeslaDriving {
	public static void main(String[] args) {
		
		Tesla tesla = new Tesla();
		tesla.setModel("Model 3"); 
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
	
		
		System.out.println("Model: "+tesla.getModel());
		System.out.println("Range: "+tesla.getRange());
		System.out.println("0 to 60: "+tesla.getZeroTo60());
		System.out.println("price: "+tesla.getPrice());
		System.out.println("is it selfdriving: "+tesla.isSelfDriving());
		
		System.out.println(tesla); //automatically calling toSting method
		System.out.println(tesla.toString());
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		
		System.out.println(myTesla);
		
		//tesla , myTesla
		
		if (tesla.getZeroTo60()>myTesla.getZeroTo60()) {
			System.out.println("faster model is: "+myTesla.getModel());
			System.out.println("0-60 speed: "+myTesla.getZeroTo60());
		}else {
			System.out.println("faster model is: "+tesla.getModel());
			System.out.println("0-60 speed: "+tesla.getZeroTo60());
		}
		
		buy(myTesla);
		buy(tesla);
		System.out.println(testDrive("Model S"));
		Tesla testCar = testDrive ("Model 3 ");
		System.out.println(testCar.toString());
		
	} // main method
	


	public static void buy (Tesla car) {
		System.out.println("Purchasing: "+car.toString());
	}
	
	public static Tesla testDrive (String model) {
		System.out.println("Hi I would like to drive Tesla 3 ");
		System.out.println("Sure no problem ");
		Tesla car = new Tesla();
		car.setTeslaInfo(model, 310, 2.5, 95000, false);
		return car;
	}
}	

