package day_42_cuatomclases_encapsulation;

public class Coffe {

	String name;
	String size; 
	double price;
	int calories;
	
	public void getCoffeInfo (){
		String info = "Can i get  "+name.toUpperCase()+", size: "+size+", price is: $"+
	price+", i know it has some calories: "+calories+"kkal";
		System.out.println (info);
	}
	
	public void setName (String newName) {
		name = newName;
		
	}
	
	public void setSize (String newSize) {
		if (newSize.equalsIgnoreCase("TALL")||
				newSize.equalsIgnoreCase("GRANDE")||
				newSize.equalsIgnoreCase("Venti")) {
			    size = newSize;
			    
		}else {
			System.out.println("Invalid size: "+newSize);
			newSize = "unknown";
		}
		
	}
	
	public void setPrice (double newPrice) {
		price = newPrice;
	}
	
	public void setCalories (int newCalories) {
		calories = newCalories;
		
	}
	
	public void setCoffeInfo (String newName, String newSize, double newPrice, int newCalories) {
		name = newName;
		size = newSize;
		price = newPrice;
		calories = newCalories;
	}
	
}
