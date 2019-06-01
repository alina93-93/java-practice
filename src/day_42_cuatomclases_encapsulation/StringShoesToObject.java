package day_42_cuatomclases_encapsulation;

import java.util.Scanner;

public class StringShoesToObject {
	public static void main(String[] args) {
		String data = "Bruno Magil, 9.5";
	//split using, and store
		String [] arrData = data.split(", ");
		//create shoe object 
		Shoes shoe = new Shoes();
		//shoe.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		shoe.brand=arrData[0];
		shoe.size=Double.parseDouble(arrData[1]);
		System.out.println(shoe.getShoesData());
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Waht shoe brand  do you like?");
		String brand = scan.next();
		System.out.println("What size?");
		double size= scan.nextDouble();
		//create obj using data scanner
		
		Shoes myShoes = new Shoes();
		myShoes.setShoesData(brand, size);
		System.out.println(myShoes.getShoesData());
		
	
		
		
	}

	
}
