package day_47_blocks;
import static java.lang.Math.*;
import static java.lang.Character.*;
import java.util.Arrays;
import static java.time.LocalDateTime.now;

public class StaticImports {
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(max(10,5));
		System.out.println(min(3,8));
		System.out.println(floor(4.95));
		System.out.println(round(45.99));
		System.out.println(abs(-99)); /// - absolute value
		System.out.println(pow(10.4, 2)); // square в степени ^2
		System.out.println(sqrt(5)); // koren' iz 5 
		System.out.println(random()*10);
		
		System.out.println("=======================");
		
		System.out.println(isDigit('4'));
		System.out.println(isAlphabetic('a'));
		
		int [] nums = { 34, 23, 65, 89, 100 };
		System.out.println(Arrays.toString(nums));
		System.out.println(now());
		
	}


}
