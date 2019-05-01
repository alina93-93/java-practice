package Practice;


import java.util.*;

public class LeeCode {
    public static double tipPercentage;
    public static double totalTip;


    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        String split, quality;
        int headCount;
        double price;

        Scanner scan = new Scanner(System.in);
        LeeCode calculator = new LeeCode();

        System.out.println("Split:");
        split = scan.nextLine();
        System.out.println("Number of people:");
        headCount = scan.nextInt();
        scan.nextLine();
        System.out.println("Check amount:");
        price = scan.nextDouble();
        scan.nextLine();
        System.out.println("Service Quality:");
        quality = scan.nextLine();
        
        calculator.getTip(split, headCount, price, quality);

    }

    public void getTip (String split, int headCount, double price, String quality){

        HashMap<String, Double> sQuality = new HashMap<String, Double>();
        sQuality.put ("excellent", .25);
        sQuality.put ("great", .20);
        sQuality.put ("good", .15);
        sQuality.put ("fair", .10);
        sQuality.put ("poor", .05);
        
        for (String key: sQuality.keySet()){
          if (key.equalsIgnoreCase(quality)){
            tipPercentage=sQuality.get(key);
          }
        }

        
/*        switch (quality.toLowerCase()) {
        case "excellent":
            tipPercentage = .25;
            break;
        case "great":
            tipPercentage = .20;
            break;
        case "good":
            tipPercentage = .15;
            break;
        case "fair":
            tipPercentage = .10;
            break;
        case "poor":
            tipPercentage = .05;
            break;
        } */
        
        totalTip = tipPercentage*price;
        price+=totalTip;
        
        System.out.print("Number of people entered: ");
        for (int i = 0; i < headCount; i++) {
            System.out.print("&");
        }
        System.out.println("\nTotal to pay: " + price);
        System.out.println("Total tip: " + totalTip);
        System.out.print("Total per person: ");
                
        if (split.equalsIgnoreCase("yes")){
            System.out.println(price/headCount);
            System.out.println("Tip per person: " + (totalTip/headCount));
        }else{
            System.out.println(price);
            System.out.print("tip per person: " + totalTip);
        }
    }

}