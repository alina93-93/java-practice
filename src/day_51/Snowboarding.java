package day_51;

public class Snowboarding extends Exercise {
	@Override
	public int perform (int min) {
		super.perform(10); // calling version from parent class
		System.out.println("Perfoming snowboardinf");
		return min *3;
	}

}
