package day_19;

public class Do_while {
public static void main(String[] args) {
	// print 9 - 10 with while loop help
	
	int i = 1;
	do {
		System.out.println(i);
		i++;
	} while (i <= 10);
	
	System.out.println("==========================");
	System.out.println();
	
	// write a do while loop calculate sum of num
	//berween 1 -5
	//1+2+3+4+5 ==> 15
	
	int sum = 0;
	int j = 1;
	do {
		sum = sum+j;
		j++;
	}while(j <= 5);
	System.out.println("Sum from 1-5 is:"+sum);
	
	
	
	
}
}
