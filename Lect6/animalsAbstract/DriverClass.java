package animalsAbstract;

import java.util.Scanner;

public class DriverClass {
	
	public static void main(String[] args) {
		String name,breed,color;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the dog : ");
		name = sc.nextLine();
		System.out.print("Enter the breed of the dog : ");
		breed = sc.nextLine();
		System.out.print("Enter the color of the dog : ");
		color = sc.nextLine();
		sc.close();
		Dog dog = new Dog(breed,color,name);
		dog.speak();
		dog.eat();
		Animals animal = new Dog(breed,color,name);
		animal.speak();
		animal.eat();
	}

}
