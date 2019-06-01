package day_43_enscapsulation_constructor;

public class MicroCenter {
	public static void main(String[] args) {
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		
		comp1.setBrand("iMac");
		comp1.setOs("macOS High Sierra");
		comp1.setPrice(1000);
		
		comp2.setBrand("Dell");
		comp2.setOs("Windows 10");
		comp2.setPrice(700);
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		
		Computer comp3 = new Computer ("ASUS", "Windows 7", 300);
		System.out.println(comp3.toString());
		
		comp3.setOs("Windows 11");
		comp3.setPrice(comp3.getPrice()-100);
		System.out.println(comp3.toString());
		
	}

}
