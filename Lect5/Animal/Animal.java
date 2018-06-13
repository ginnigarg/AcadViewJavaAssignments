package Animal;

public class Animal {
	String breed;
	String color;
	
	void speak() {
		System.out.println("Animal is creating noise");
	}
	
	public static void main(String[] args)
	{
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		animal.speak();
		dog.speak();
		cat.speak();
		
	}

}
