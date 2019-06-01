package day_50;

public class FullTimeEmployee extends Employee {
	@Override
	public void caiculatePay (int hours, double rate) {
		double total = (hours*rate)* 0.05 + (hours*rate);
		System.out.println("Full TIme empl pa: "+ total);
		
	}

}
