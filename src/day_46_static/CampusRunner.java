package day_46_static;

public class CampusRunner {
	public static void main(String[] args) {
		
		Campus campus1 = new Campus ("McLean");
		Campus campus2 = new Campus ("Chicago");
		Campus campus3 = new Campus ("Ausstin");
		Campus campus4 = new Campus ("Paris");
		
		
		Campus.campusInfo();
		Campus.campusInfo();
		Campus.campusInfo();
		System.out.println(Campus.country);
	}

}
