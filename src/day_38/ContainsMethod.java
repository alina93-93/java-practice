package day_38;

import java.util.ArrayList;

public class ContainsMethod {
	public static void main(String[] args) {
	
	
	
	ArrayList<String> list1 = new ArrayList<>();
   list1.add("Jan");
   list1.add("Feb");
   list1.add("Mar");
   list1.add("Apr");
   list1.add("May");
   list1.add("Jun");
   list1.add("July");
   System.out.println(list1.toString());
   System.out.println();
   
   
   ArrayList<String> list2 = list1; // list1 and list2 point to the same object
                                         // copy all values from list1
   ArrayList <String> month = new ArrayList<>(list1);
   System.out.println(month);
   System.out.println();
   
   month.add("Aug");
   month.add("Sept");
   month.add("Oct");
   list1.add("July");
   System.out.println(month);
   System.out.println(month.contains("Jan"));
   System.out.println(month.contains("Dec"));
   System.out.println();
   
   // how to check is Feb on the second index.
   
   System.out.println(month.indexOf("Feb")==1);
   System.out.println(month.get(1).equals("Feb"));
   
   ArrayList<String> month2 = new ArrayList<>(list1);
   System.out.println("Month: "+month.toString());
   System.out.println("Month: "+month2.toString());
	
   // check if month has all values from month2
   if (month.containsAll(month2)) {
	   System.out.println("Moth has all values of Month2");
   }else {
   System.out.println("Some values are missing");
   
   
   
   
   
   }

}
}