package day_46_static;

public class Ebay {
	public static void main(String[] args) {
		
		Customer c1 = new Customer ("Zchenya", "gavrilov@gmail.com");
		Customer c2 = new Customer ("Sasha", "garbarenko@gmail.com");
		Customer c3 = new Customer ("Vitalya", "shevchenko@gmail.com");
		
		
		System.out.println(c3.count);
		System.out.println(Customer.count);
		
		Customer c4 = new Customer ("Allen", "espinial@gmail.com");
		System.out.println(Customer.count);
		
		c1.count =10;
		System.out.println(c3.count);
		System.out.println(Customer.count);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		
		
	}

}
