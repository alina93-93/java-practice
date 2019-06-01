package Practice;

public class Tv {
	int channel;
	int volumeLevel;
	boolean on;
	String brand ;
	 
	public Tv () {
		System.out.println("Creating TV object using no Args- constructor");
	}
	
	public Tv (String brand ) {
		this.brand = brand;
	System.out.println("Creating TV object using 1 arg - constructor");
		
	}
	public void channelUp () {
		channel++;
		
	}
	
	public void channelDown () {
		channel--;
	}
	
	public void volumeUp () {
		
		volumeLevel++;
		
	}
	
	public void volumeDown () {
		
		volumeLevel--;
	}
	
public void turnOn ( ) {
		
		if (on = true) {
			System.out.println( "TV is already ON");
		}
	}
		public void turnOff() {
			if (on = false) { 
				System.out.println("TV is already OFF");
			}
	}
		public boolean isOn (boolean on) {
			this.on = on;
			return on;
		}
		
		
		@Override
		public String toString() {
			return "Tv [channel = " + channel + ", volumeLevel = " + volumeLevel + ", on = " + on + ", brand = " + brand + "]";
		}
		public int getChannel() {
			return channel;
		}
		public void setChannel(int channel) {
			this.channel = channel;
			if (!(channel <= 0 && channel > 120) ) {
				System.out.println("ERROR: TV is either OFF or invalid Channel");
			}		
		
		}
		public int getVolumeLevel() {
			return volumeLevel;
		}
		public void setVolumeLevel(int volumeLevel) {
			if ((!on) && !(volumeLevel <=7 && volumeLevel >=1)) {
				System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
		}
		
		public boolean isOn() {
			return on;
		}
		public void setOn(boolean on) {
			this.on = on;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
			
		
}
		
	