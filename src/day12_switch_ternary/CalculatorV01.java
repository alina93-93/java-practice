package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = input.nextDouble();
		System.out.println("Enter second number");
		double num2 = input.nextDouble();
		//get operator 
		System.out.println("Select operator: + - * / %");
		
		String operator = input.next();
		double result = 0.0;
		
		// perform calculation and display result 
		if (operator.contentEquals("+")) {
			result = num1 + num2;
		}else if (operator.contentEquals("-")) {
			result = num1 - num2;
		}else if (operator.contentEquals("*")) {
			result = num1 * num2;
		}else if (operator.contentEquals("/")) {
			if(num2 == 0)
			result = num1 / num2;
			System.out.println("Error");
		}else if (operator.contentEquals("%")) {
			result = num1 % num2;	
		}else {
			System.out.println("Invalid operator selected: "+operator);
			return; // meaning do nor execute . STOP HERE

			
		}
        System.out.println("Result: "+result);
		
	}

}
