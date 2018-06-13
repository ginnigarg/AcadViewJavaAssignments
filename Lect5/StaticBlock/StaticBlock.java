package StaticBlock;

public class StaticBlock {
	static int number = 1;
	
	static{
		System.out.println("First Static Block");
		number++;
		System.out.println("Value of number after first static block : "+number);
	}
	static{
		System.out.println("Second Static Block");
		number+=10;
		System.out.println("Value of number after second static block : "+number);
	}
	
	static void display(){
		System.out.println("Value of number after execution of all static blocks : "+number);
	}
	
	public static void main(String args[])
	{
		display();
	}

}
