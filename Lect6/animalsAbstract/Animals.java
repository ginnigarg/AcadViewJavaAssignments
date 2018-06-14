package animalsAbstract;

public abstract class Animals {
	
	String color,breed,name;
	
	abstract void eat();
	
	void speak() {
		System.out.println("Animal is speaking");
	}

}
