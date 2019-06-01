package day_41_customclasses02;

public class Microwave {

	String brand;
	boolean isOn = true; // false (because is default value), true - is on ; false is off;
	
	public void turnOn ( ) {
		
		if (isOn == true) {
			System.out.println("It is already on");
		}else {
			System.out.println("Turning on "+brand+" microvawe");
		}
	}
		public void turnOf() {
			
			if (isOn == false) { // !isOn
				System.out.println("It is alredy of");
			}else {
				System.out.println("Turning off "+brand+" microvawe");
			}
		
	}
	
		public void heat (String food) {
			if (isOn) {
				System.out.println("Heating "+food);
			}else {
				System.out.println("Microvawe is off and can not heat "+food);
			}
			
		}
}
