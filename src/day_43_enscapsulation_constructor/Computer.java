package day_43_enscapsulation_constructor;

public class Computer {
	
	private String brand;
	private String os;
	private double price; 
	
	// add a constuctor



	public Computer () {
		System.out.println("Computor constractor...");
		brand ="unknown";
		os = "unknown";

	}
	
	public Computer (String brand, String os, int price) {
		this.brand = brand;
		this.os = os;
		this.price = price;
		
	}
		
	@Override
	public String toString() {
		return "Computer [brand = " + brand + ", os = " + os + ", price = $" + price + "]";
	}



	public String getBrand() {
		return brand;
	}
	
	public void setBrand (String brand) {
		this.brand = brand;
	}
	
	public String getOs() {
		return os;
	}
	
	public void setOs(String os) {
		this.os = os;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	}

	

