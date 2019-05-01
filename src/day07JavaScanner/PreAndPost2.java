package day07JavaScanner;

public class PreAndPost2 {
public static void main(String[] args) {
	int messages = 10;
	messages++;
	++messages;
	System.out.println("Messages: "+messages); //12
	
	
	int readMessages = --messages;
	
	System.out.println("Read messages: "+readMessages); // 11
	System.out.println("Messages: "+messages); //11

	int unreadMessages = readMessages--; 
	 System.out.println("unreadMessages: "+unreadMessages); // 11
	 System.out.println("readMessages: "+readMessages); //10
	 
	 
                     //11     -   10
 int total = unreadMessages++ - readMessages; 
  System.out.println("unreadMessages: "+unreadMessages); //12
  System.out.println("readMessages: "+readMessages); //9
  System.out.println("total: "+total); //1


int count = 20; 
int count2 = 10;


                 // 21 (and put it up there )   +    9
int totalCount = ++count + --count2;
System.out.println("count: "+count); //21
System.out.println("count2: "+count2); ///9
System.out.println("totalCount: "+totalCount); //30

              // 21  +(1)    22 +1     (22 because ++ after the number)
int myCount = count++ + ++count;
System.out.println("Count: "+count);
System.out.println("myCount: "+myCount);









}
}
