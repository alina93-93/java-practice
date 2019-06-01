package day_42_cuatomclases_encapsulation;

public class Person {
//declare name and age encapsulated
	private String name;
	private int age;
	
	//public getter and setter methods for name
	// read only 
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
		
	}
	//write only 
	public void setName(String name) {
		this.name = name;
	}
}
