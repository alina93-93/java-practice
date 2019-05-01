package day4_primitives_operators;

public class StringsConcat {
public static void main(String[] args) {

//strint the variable called firstName and assign your firstname
	
String firstName = "Ange";
//print - My name is Ange

System.out.println("My Name is " + firstName);

//city variable and assign city where you are from

String city = "Bila Tserkva";

//Print: I was born in 

System.out.println("I was born in " + city );

//Create a variable :job and assign SDET to it
//Create a var: company and assign any company 
//Print: I work as <SDET> in <company>

String job = "SDET";
String company = "CapitalOne";

System.out.println("I was as "+job+ " in "+company);

//create int variable zipcode and assign zipcode of your home 
//Print: I live in <20610> zipcode

int zipcode = 20910;
System.out.println("I live in " + zipcode + " zipcode");

int num1 = 10;
int num2 = 20;
System.out.println(num1+""+num2); // because of "" - we will have 1020, without "" -  we could have 30.

}
}
