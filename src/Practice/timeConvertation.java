package Practice;

import java.util.Arrays;
import java.util.Scanner;



public class timeConvertation {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		timeConvertation (scan.nextLine());
	}
public static void timeConvertation (String s) {
	
	String [] arr = s.split(":");
	System.out.println(Arrays.toString(arr));
	
	if(arr [2].contains("PM")) {
		arr[0]=Integer.toString(Integer.parseInt(arr[0]+12));
	}
	System.out.println(Arrays.toString(arr));
	
	arr[2] = arr[2].replaceAll("\\D","");
	System.out.println(Arrays.toString(arr));
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[1]);
		if (i!=arr.length-1) {
			System.out.println(":");
		}
	}
}
	
	
}
