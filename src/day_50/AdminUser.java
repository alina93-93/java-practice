package day_50;

public class AdminUser extends SlackUser {
	
	public AdminUser (String name) {
		super (name);
	}
	@Override
	public void sendAMessage(String message) {
		System.out.println(getName() + " is sending a message <" + message + ">");
	}


  long  num1  =   9L;

 float  num2  =  9F;

 double  num3  =  9L;

  byte  num4 = 9B;

  int  num =  '9';
  

}