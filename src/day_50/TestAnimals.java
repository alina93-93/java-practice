package day_50;

public class TestAnimals {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		a.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		a.move(20);
		cat.move(30);
		dog.move(40);
		duck.move(50);
		
	}

}
