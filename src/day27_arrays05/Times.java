package day27_arrays05;

public class Times {
public static void main(String[] args) {
	
	//declare 2 int arrays that can hold hour and minute
	int[] time1 = new int[2];//0,0 by default
	int[] time2 = new int[2];//0,0 by default
	/*
	 * int[] time1 = {20, 45} ;
	   int[] time2 = {15, 33} ;
	 * 
	 */
	//System.out.println(time1[0]); //0
	time1[0] = 10;
	time1[1] = 15;
	
	time2[0] = 16;
	time2[1] = 10;
	
	//Before comparing, check if both arrays have
	//valid hour/minute
	
	if(time1[0] < 0 || time1[0] > 23) {
		System.out.println("Time1 has invalid hour");
		return;
	}
	
	if(time1[1] < 0 || time1[1] > 59) {
		System.out.println("Time1 has invalid minute");
		return;
	}
	
	if(time2[0] < 0 || time2[0] > 23) {
		System.out.println("Time2 has invalid hour");
		return;
	}
	
	if(time2[1] < 0 || time2[1] > 59) {
		System.out.println("Time2 has invalid minute");
		return;
	}
	  
	// compare arrays 
	// compare hours and minutes
	
	
	
	if (time1[0] < time2[0] ) {
		System.out.println("Time1 is earlier  ");
	}else if (time1 [0]> time2 [0]) {
		System.out.println("Time2 is earlier  ");
	}else {
		
	if (time1[1] < time2[1] ) {
			System.out.println("Time1 is earlier  ");
		}else if (time1[1] > time2 [1]) {
			System.out.println("Time2 is earlier  ");
		
		}else if  ( time1[1] == time2 [1] ) {
			System.out.println("time1 & time2 are equal");
		}
		
	}
	
	
			
			
			
			
			
	
	
}
}
