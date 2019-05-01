package day_31;

import java.util.Scanner;



public class Calculator {
public static void main(String[] args) {
	add(3, 4);
	subtract (3,4);
	multiply (3, 4);
	devide (3, 4);
	remainder (3,4);
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter 2 numbers");
	double n1 = scan.nextDouble();
	double n2 = scan.nextDouble();
	System.out.println("Select operations: '+', '-', '*', '/', '%'"); 
			String operator = scan.next();
			
			/// using switch statement call the matching method to perform calculation
			
			switch (operator) {
			case "+" : 
				add (n1, n2);
				break;
			case "-":
				subtract (n1, n2);
				break;
			case "*":
				multiply (n1, n2);
			case "/":
				devide (n1, n2);
		        break;
			case "%":
				remainder(n1, n2);
				break;
				default:
			System.out.println("invalid operator");
			
			}
}


public static void add(double num1, double num2) {
	double result = num1+num2;
	System.out.println("result "+result);
}
public static void subtract(double num1, double num2) {
	double result = num1-num2;
	System.out.println("result "+result);
}
public static void multiply(double num1, double num2) {
	double result = num1*num2;
	System.out.println("result "+result);
}

public static void devide(double num1, double num2) {
	if (num2==0) {
		System.out.println("Cant be devided by zero");
		return;
	}
	double result = num1/num2;
	System.out.println("result "+result);
}
public static void remainder (double num1, double num2) {
	double result = num1%num2; 
	System.out.println("result "+result);
}




}
