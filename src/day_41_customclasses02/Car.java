package day_41_customclasses02;

public class Car {

	String make;
	String model;
	int curentSpeed;
	String color;

	
	public void printCarInformation() {
		String info = "Car make["+make+"], model["+model+" "+curentSpeed;
			System.out.println(info);
	}
	
	public void showCurrentSpeed(int speedLimit) {
		if(curentSpeed <= speedLimit) {
			System.out.println(make+" is driving at "+curentSpeed+
					" mph, following the speed limit -" + speedLimit);
		}else {
			System.out.println(make+" is driving at "+curentSpeed+
					" mph, over the speed limit -" + speedLimit);
		}
	}
	
	public void drive () {
		System.out.println(make+" "+model+"is driving.." );
	}
	
	public void accelerate (int mph) {
		curentSpeed = curentSpeed +mph; // curentSpeed +=mph
	}
}
