package day_23;

public class Arraay1 {
 public static void main(String[] args) {
	int [] numbers = new int [3];
	int num1 = 5; 
	int num2 = 7;
	int num3 =10;
	//assign to the first element data type , we have to use data
	
	numbers[0] = num1;
    numbers[1] = num2;
    numbers[2] = num3;
    
    numbers[0] = 7;
    numbers[1] = 8;
    
//  we cannot provide different data type, we have to use data type of an array
//  numbers[2] = "A";
    
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    System.out.println("*****************");
    
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
    // the maximum size of array
  //  byte[] bytesArray = new byte[Integer.MAX_VALUE-5];

}
}
