package DAy20;

import java.util.Scanner;

public class MultiplacaionTable {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		// check if it is void. 1-10
		// if it not valid return
		// for loop to print multiplication table

		if (num < 1 || num > 10) {
			System.out.println("Error: Invalid input");
			// return; // stop execution here
			System.exit(0); // stop execution
		}
		// for loop to print multiplication table
		for (int i = 1; i <= 10; ++i) {
			System.out.println(num + " x " + i + " = " + (num * i)); //command +shift + F
	}

	}

}
