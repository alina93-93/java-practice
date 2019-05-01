package day_23;

public class CheckTheNumber {
	public static void main(String[] args) {
		
		for (int i = 1; i<= 100; i++){
	 	if (i%5>0) {     // if i%5==0  it this point it will skip this number
			continue;
		}
	 	System.out.println("Number: "+i);
	}

	}
}
