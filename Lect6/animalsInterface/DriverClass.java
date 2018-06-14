package animalsInterface;

public class DriverClass {
	
	public static void main(String [] args)
	{
		Animals dog = new Dog();
		Animals cat = new Cat();
		dog.speak();
		dog.eat();
		cat.speak();
		cat.eat();
	}
}
