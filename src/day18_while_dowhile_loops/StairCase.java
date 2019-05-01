package day18_while_dowhile_loops;

public class StairCase {
public static void main(String[] args) {
	String stairs = "*"; 
	System.out.println(stairs);
	
	stairs = stairs+ "*";
	System.out.println(stairs);
	
	stairs+= "*";
	System.out.println(stairs); // the same : stairs = stairs+ "*" and stairs+= "*"
	
	stairs+= "*";
	System.out.println(stairs);
	
	System.out.println();
	System.out.println("===================");
	
	String stairs1 = "*";
	// 1) with a counter
	
	int num = 1;
	while (num <= 10) {
		System.out.println(stairs1);
		stairs1+= "*";
		num++;
	}
	
	
	// by checking the lenght
	
	String stairs2 = "*";
	while (stairs2.length()<= 10) {
		System.out.println(stairs2);
		stairs2 +="*";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
