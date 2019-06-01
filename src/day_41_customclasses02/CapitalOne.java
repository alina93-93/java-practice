package day_41_customclasses02;

public class CapitalOne {
public static void main(String[] args) {
	
	BankAccount acc1 = new BankAccount ();
	acc1.accountHolder = "Bill Gates";
	acc1.deposit(250);
	acc1.accountNumber = 1234567;
	acc1.withdrow(100);
	acc1.showBalance();
	
	acc1.charge(50, "wooden Spoon");
	acc1.showBalance();
}
}
