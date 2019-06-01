package day_46_static;

public class Campus {

	
	private String city;
	static String country;
	
	static {
		System.out.println("static block");
		country = "UA";
	}
	
	static {
		System.out.println("static block - 2");
		country = "Canada";
	}
	
	
	@Override
	public String toString() {
		return "Campus [city=" + city + "]";
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public Campus ( String city) {
		System.out.println("constructor");
		this.city = city;
	}
	
	public static void campusInfo () {
		System.out.println("welcome to campus");
	}
}
