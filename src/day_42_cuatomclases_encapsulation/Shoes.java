package day_42_cuatomclases_encapsulation;

public class Shoes {

	
	String brand;
	double size;
	
	public void setShoesData (String newBrand, double newSize) {
		brand = newBrand;
		size = newSize;
	}
	
	public String getShoesData () {
		return brand + " | " + size;
	}
}
