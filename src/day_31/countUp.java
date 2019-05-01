package day_31;

import java.util.Scanner;

public class countUp {
	
public static void main(String[] args) {
	
	countUp(6);
	countUp(9);
	countUp(-9);
	countDown(2);
	int l = 5;
	countDown(l);
	countDown(-3);
	
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter number to countUp");
	int inputNum = scan.nextInt();
	
	countUp(inputNum);
	
}
public static void countUp(int n) {
	
	if (n<1) {
		System.out.println("Invalid input"); 
	}else {
	 
	for (int i=1; i<=n; i++) {
		System.out.print(i+" ");
	}
	System.out.println();
}
}

public static void countDown(int k) {
	 if  (k < 1){
		 System.out.println("invalid input");
	 }else {
	for (int j=k; j>=1; j--) {
		System.out.print(j+" ");
	}
	 }
System.out.println();
}

}