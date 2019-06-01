package day_50;

public class SlackChannel {
public static void main(String[] args) {
	
	
	SlackUser su = new SlackUser ("Nadir");
	AdminUser au = new AdminUser ("Florian");

	su.sendAMessage("Bla bla bla ...bla.also BLABLABLA");
	au.sendAMessage("Thank you xoxo");
}

}
