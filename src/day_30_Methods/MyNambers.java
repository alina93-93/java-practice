package day_30_Methods;

import java.util.Random;
import java.util.Scanner;

public class MyNambers {

	public static void main(String[] args) {
		showMe5Numbers();
		showMe5Numbers();
//      while (true){
//      showMe5Numbers();
//      }
		doPush10Ups ();
		
		rangePrint ();
		
	}
	
	
	public static void showMe5Numbers(){
		
	
		Random r = new Random();
		for (int i = 1; i<=5; i++) {
		 System.out.print(r.nextInt(1001)+" ");
		}
		System.out.println();
		
	}
	
	public static void doPush10Ups () {
		
		for (int p =1; p<=10; p++) {
			System.out.println("Do push up # "+p);
		}
		System.out.println("Time to rest");
	}
	
	public static void  rangePrint () {
		
		Scanner obj = new Scanner (System.in);
		System.out.println("Provide two #'s");
		int numb1 = obj.nextInt();
		int numb2 = obj.nextInt();
		
		if(numb1 < numb2) {
			for (int i  = numb1; i <= numb2; i++) {
				System.out.print(i+" ");
			}
			
		}else if (numb1>numb2) {
			for (int k = numb1; k>= numb2; k--) {
				System.out.print(k+" ");
			}
		}else {
			System.out.println(numb1);
		}
		
		
		
		
		
	}
}
