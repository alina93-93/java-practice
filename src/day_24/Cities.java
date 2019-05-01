package day_24;

public class Cities {
	public static void main(String[] args) {
		String [] cities = {"Washington D.C.", "Kiev", "Annadale", "Moscow",
				"Instanbul","Baku", "Miami", "Silver Spring", "McLean"};
		System.out.println(cities.length);
		// task print all cities that start with M
		for (int i =0; i<cities.length; i++) {
			if (cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		
		for ( String city: cities) {
			if (city.startsWith("M")) {
				System.out.println(city);
			}
		}
	}

}
