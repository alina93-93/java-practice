package day_50;

public class App {

	public static int count;
	String name;
	
	public App (String name) {
		this.name = name;
		
	}
	
	public static void build(String language) {
		System.out.println("Building an app using "+language);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
