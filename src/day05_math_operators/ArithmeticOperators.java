package day05_math_operators;

public class ArithmeticOperators {

public static void main(String[] args) {

// + - addition operator 
	
System.out.println(55+5);
	
int chair = 140;
System.out.println(chair + 2);
	
int moreChairs = chair + 5;
System.out.println(moreChairs);

int tables = 130;
int total = tables + chair;
System.out.println(total);

// substruction - 
 
System.out.println(500-123);
int result = 44-23; 
System.out.println(result);

double balance = 1200.50;
double transaction = 56.44;
System.out.println(balance-transaction);
balance = balance - transaction; 

System.out.println(balance);

//create a variable linesOfCode and assign 50 and print "lines of code 50" => byte or int 

//you deleted 2 lines 

//decrease the value of linesOfCode by 2 and print  "Line of code 48"

int linesOfCode = 50;
System.out.println("Lines of code "+linesOfCode);

linesOfCode = linesOfCode-2;
System.out.println("Lines of code are "+linesOfCode);

//multiplication *

System.out.println(22*2);

// declare variables classes and assign 5

int classes = 5;

System.out.println(linesOfCode * classes);

int totalLinesOfCode = linesOfCode * classes;
//totalLinesOfCode=240

System.out.println("Total lines of code are "+totalLinesOfCode);

//DEVISION operator

System.out.println(10 / 3); // look at the line #67

System.out.println(55 /5 );

System.out.println(10.0/3);

System.out.println(15/7);  //=> 2
System.out.println(15.0/7); // => 2.142857142857143
System.out.println(5.0/2); // =>2.5
System.out.println(5 / 2); // => 2


System.out.println(11/0); // throw error while running your code. 
// in  Java, when you devide by 0, code will compile .
//But when 



}
}
