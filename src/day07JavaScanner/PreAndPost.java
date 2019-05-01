package day07JavaScanner;

public class PreAndPost {
public static void main(String[] args) {

	int num = 0;
	int num2 = num++;
	
	
	System.out.println("num: "+num);
	System.out.println("num: "+num2);
	
	int n = 0;
	int n2 = ++n;
	System.out.println("n: "+n);
	System.out.println("n2: "+n2);
	
	int i = 10;
	i++; // add1
    ++i;  //add1
	System.out.println("i: "+i);
	
	int bananas = 6; // 9
	int pears = bananas++; //6
	int apples = ++bananas; //7
	
	System.out.println("bananas: "+bananas);
	System.out.println("pears: "+pears);
	System.out.println("apples: "+apples);
	
	int bananas1 = 6; 
	int apples1 = ++bananas1; 
	int pears1  = bananas1++; 
	
	System.out.println("bananas1: "+bananas1);
	System.out.println("apples1: "+apples1);
	System.out.println("pears1: "+pears1);
	
	
	
	int friends = 10;
	System.out.println(friends++);
	System.out.println(friends);
	System.out.println(++friends);
	
	
	
	
	int p1 = 10;
	int sum = p1++ +5;
	
	// if you want p1 + 5 assign to sum
	// p = p+1
	
	
	System.out.println("sum: "+sum);
	System.out.println("p1: "+p1);
	
	
	int batteries = 8;
	int oldBatteries = 5; // 8       +       6 (increased it first:  because ++ => before it)
	int totalBatteries = batteries++ + ++oldBatteries;
	System.out.println("batteries: "+batteries); //9
	System.out.println("oldBatteries: "+oldBatteries); //6 
	System.out.println("totalBatteries: "+totalBatteries); //14
	
	
	
	
}	
}
