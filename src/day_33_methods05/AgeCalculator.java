package day_33_methods05;

public class AgeCalculator {
public static void main(String[] args) {

	int yourAge = ageC(1999);
	System.out.println("Your age is "+yourAge);
}
public static int ageC (int year) {
	int currentYear= 2019;
	int age = currentYear - year;
	
	if (age >= 1 && age <= 14) {
		System.out.println("Child");
	}else if (age >= 15 && age <= 25 ) {
		System.out.println("you are youngster");
	}else if (age >= 26 && age <= 64) {
		System.out.println("adult");
	}else if (age > 65) {
		System.out.println("senior");
	} else {
		System.out.println("Invalid age");
	}
	return age;
}

}
