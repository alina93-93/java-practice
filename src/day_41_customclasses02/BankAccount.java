package day_41_customclasses02;

public class BankAccount {

	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("depositing money "+" to "+accountHolder );
		balance += amount;
		
	}
	
	public void withdrow (double amount) {
		System.out.println("withdrowing $" +amount+ " from " + accountNumber);
		balance -= amount;
		if (balance < 0) {
			System.out.println("balanse is negative");
		}
	}
	public void showBalance() {
		System.out.println("===================");
		System.out.println("accountHolder: " + accountHolder);
		System.out.println("accountNumber: " + accountNumber);
		System.out.println("balance: $" + balance);
		System.out.println("===================");
	}
	
	public void charge (double price, String item) {
		if (balance >= price) {
			System.out.println("thank for purchase - "+item);
			balance -= price;
		}else {
			System.out.println("Not enough funds in your  account# "+ accountNumber+ " for buing "+ item);
		}
	}
		
	}
	
	
	
