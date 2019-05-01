package day_23;

public class FromAtoZ {
public static void main(String[] args) {
	
	//outterloop will repeat printing of letter as many times as want 
	// in this case we are gonna print 3 times
	// so we are relocating inner loop 3 times
	for (int i = 0; i< 7; i++) {
	    
	    	
	    // if index is even , print from z till a 
	    	if (i%2==0) {
	    		for (char letter = 'a'; letter <='z'; letter++) {
	    			System.out.print(letter);
	    		}
	    	}else {
	    		for (char letter = 'z'; letter <='a'; letter--) {
		System.out.print(letter);
	}
	    	}
    System.out.println();
	System.out.println("****************************");
	
}
}
}
