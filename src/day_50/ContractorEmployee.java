package day_50;

public class ContractorEmployee extends Employee {
	@Override
	public void caiculatePay (int hours, double rate) {
	double total = hours*rate+200;
	System.out.println("Contt total pay "+total);
	}
}
