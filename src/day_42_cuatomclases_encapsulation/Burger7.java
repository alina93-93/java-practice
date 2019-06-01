package day_42_cuatomclases_encapsulation;

import java.util.Arrays;

public class Burger7 {
	public static void main(String[] args) {
		
		Burger burger1 = new Burger();
        burger1.name = "COWBOY";
        String[] ings = {"onion crisps", "american cheese", 
                       "pickles", "lettuce", "b7 sauce"};
        
        burger1.ingridients = ings;
        System.out.println(burger1.name);
        System.out.println(Arrays.deepToString(burger1.ingridients));
        System.out.println(burger1.ingridients[0]);
        System.out.println(burger1.ingridients[1]);
        System.out.println(burger1.ingridients[2]);
        System.out.println(burger1.ingridients[3]);
        System.out.println(burger1.ingridients[4]);
        
        /// or 
        System.out.println();
        System.out.println("*****************************");
        System.out.println();
        
        
        for (int i = 0; i<burger1.ingridients.length; i++) {
        	System.out.println(burger1.ingridients[i]);
        }
	}

}
