package day_25;

public class ShoppingList {
	public static void main(String[] args) {
		String[] products = {"Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag","Addidas sucks" };
		double [] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int [] itemId = {12345, 12346, 12347, 12348, 12349};
		
		// print the count of products 
		System.out.println("Products count = "+products.length);
		// check if products prices and items IDs has same count
	    
		if ( products.length == prices.length && products.length == itemId.length ) {
			System.out.println("Shopping list looks good");
		}else {
			System.out.println("Something is wrong with this list");
			return;
		}

		// loop through products and print  each one in separate line 
		
		for (String p  : products ) {
			System.out.println(p);
		}
		
		// prices --> for loop
		for (int i = 0; i< prices.length; i++) {
			System.out.println(prices [i]);
		}
		
		System.out.println("************");
		
	 // itemID print this in reverse order using a  loop
		System.out.println(itemId [itemId.length-1]);
		
		for ( int idx = itemId.length-1; idx>=0; idx--) {
			System.out.println(itemId[idx]);
		}
		
		// print a report. with a total price 
		// item 1 : 12345 - Timberlend Shoes - $120.0
		
		System.out.println("############# Your Shopping Receipt #########");
		System.out.println();
		

		
		
		for (int i = 0; i < products.length; i++) {
			System.out.println("item "+(i+1)+": "+itemId[i]+" - "+products[i]+ " - $"+ prices[i]);
			
		}
		//need to get totalPrice
		double totalPrice= 0.0;
		for (int i=0;i<products.length;i++) {
			System.out.println("Item "+i+": "+itemId[i]+" - "+products[i]+" - $"+prices[i]);
		totalPrice+=prices[i];
		
		}
		
		System.out.println("Total Price: $"+totalPrice);
		
		// find the most expensive item in your list and print it as a report
		// loop and find. Do not use Arrays class
		
		int maxIndex = 0;
		double maxPrice = 0;
		//120.0, 5.99, 150.50, 3000.5, 6.99
		
		for ( int j = 0; j < prices.length; j++) {
			if (prices[j]>maxPrice) {
				maxPrice = prices [j];
				maxIndex = j;
				
			}
		}
		
		System.out.println(itemId[maxIndex]+" - "+ products[maxIndex] +"- $ "+ maxPrice);
		
		
	}

}
