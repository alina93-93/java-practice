package Practice;


public class Mainc {
public static void main(String[] args) {
	
	Tv ch1 = new Tv();
	ch1.channel = 1;
	ch1.volumeLevel = 1;
	ch1.on = false;
	ch1.brand = "undefined";
	ch1.turnOn();
	
	System.out.println(ch1.toString());
	
	Tv ch2 = new Tv("underfined");
	ch2.channel = 1;
	ch2.volumeLevel = 1;
	ch2.on = false;
	ch2.isOn();
	ch2.setVolumeLevel(-5);
	ch2.volumeDown();
	ch2.volumeDown();
	ch2.volumeDown();
	ch2.setChannel(300);
	
	System.out.println(ch2);
	
	

}

}
