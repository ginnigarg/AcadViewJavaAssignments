package animalsAbstract;

public class Dog extends Animals {
	
	Dog(String breed,String color,String name) {
		this.color = color;
		this.breed = breed;
		this.name = name;
	}
	
	void speak() {
		System.out.println(name + " of breed " + breed  + " and color "+ color + " is Barking");
	}
	
	void eat() {
		System.out.println(name + " of breed " + breed  + " and color "+ color + " is eating");
	}

}
