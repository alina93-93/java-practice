package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {
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
		
		switch(operator) {
		case "+":
		   System.out.println(result = num1 + num2);
		   break;
		case "-":
		   System.out.println(result = num1 - num2);
		   break;
	    case "*":
		   System.out.println(result = num1 * num2);
		   break;
		case "/":
		   System.out.println(result = num1 / num2);
		   break;
	    case "%":
           System.out.println(result = num1 % num2);
		   break;
	    default:
	       System.out.println("Invalid operator selected: "+operator);
		
		
	}	
	}
	}
