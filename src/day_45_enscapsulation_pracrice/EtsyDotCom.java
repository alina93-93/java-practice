package day_45_enscapsulation_pracrice;

public class EtsyDotCom {
public static void main(String[] args) {
	
	EtsyAccount acct1 = new EtsyAccount ();
	System.out.println(acct1.toString());
	
	System.out.println("******************");
	
	acct1.setEmail("alina@gmail.com");
	acct1.setFirstName("Alina");
	acct1.setPassword("anina1994");
	
	System.out.println(acct1.toString());
	
	System.out.println("*******************");
	
	
	EtsyAccount acct2 = new EtsyAccount();
	
	acct2.setEmail("alina94.com");
	acct2.setFirstName("olya43");
	acct2.setPassword("abs12");
	System.out.println(acct2.toString());
	
	System.out.println("****************************");
	
	EtsyAccount acct3 = new EtsyAccount ("olya93@gmail.com", "Olyyyya", "cat3love");
	System.out.println(acct3.toString());
	
	System.out.println("******************************");
	
	EtsyAccount acct4 = new EtsyAccount ("woodenspoon@gmail.com", "WdSpoon");
	System.out.println(acct4.toString());
	
	
}
}
