package day_42_cuatomclases_encapsulation;

import java.util.ArrayList;

public class DSWShoesStore {
	public static void main(String[] args) {
		
		Shoes shoes1 = new Shoes();
	    shoes1.setShoesData("ALDO",37.7);
	    System.out.println(shoes1.getShoesData());
	    

		Shoes shoes2 = new Shoes();
	    shoes2.setShoesData("TOMS",36.5);
	    
	    

		Shoes shoes3 = new Shoes();
	    shoes3.setShoesData("VANS",36.7);
	  
	    
	    Shoes [] shoesArray = new Shoes[3];
	    shoesArray [0] = shoes1;
	    shoesArray [1]= shoes2;
	    shoesArray [2] =shoes3;
	   
	    System.out.println(shoesArray[0].getShoesData());
	    System.out.println(shoesArray[1].getShoesData());
	    System.out.println(shoesArray[2].getShoesData());
	    
	    System.out.println(shoesArray[0].brand);
	    System.out.println(shoesArray[1].brand);
	    System.out.println(shoesArray[2].brand);
	    
	    ArrayList<Shoes> myShoes = new ArrayList<>();
	    
	   myShoes.add(shoes1);
	   myShoes.add(shoes2);
	   myShoes.add(shoes3);

	    System.out.println(myShoes.get(0).getShoesData());
	    System.out.println(myShoes.get(0).size);
	    System.out.println(myShoes.get(0).brand);
	    
	    System.out.println(myShoes.get(1).getShoesData());
	    
	    Shoes redShoes = myShoes.get(1);
	    System.out.println(redShoes.getShoesData());
	    
	    for (Shoes shoe : myShoes) {
	    	System.out.println(shoe.getShoesData());
	    }
	    // print name of shoes in the list that size is more then 37 
	    for (Shoes shoe : myShoes) {
	    	if (shoe.size>37.0) {
	    		System.out.println(shoe.brand);
	    	}
	    	
	    }
	    
	}

}
