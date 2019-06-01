package day_50;

public class Company {
public static void main(String[] args) {
	
	Employee emp = new Employee();
	FullTimeEmployee ft = new FullTimeEmployee ();
	ContractorEmployee ct = new ContractorEmployee ();
	
	emp.caiculatePay(40, 40);
	ft.caiculatePay(40, 45);
	ct.caiculatePay(40, 55);
	
}

}
