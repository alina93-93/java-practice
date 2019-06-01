package Practice;

public class maink {
	public static void main(String[] args) {
		   
		   Atts a = new Atts();
		   a.name = "ball";
		   a.color = "red";
		   a.amount = 1;
		
		   System.out.print(asString("table", "brown",1));
	}
	
	public static String asString(String name, String color, int amount) {
	
		String s = "name: "+name+" color: "+color+" amount:"+amount;
		return s;
	}
}
	
