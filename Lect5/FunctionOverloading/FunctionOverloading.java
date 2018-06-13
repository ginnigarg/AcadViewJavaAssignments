package FunctionOverloading;

public class FunctionOverloading {
	
	static void print() {
		System.out.println("Print Function with null arguements");
	}
	
	static void print(int num) {
		System.out.println("Print Function with int arguement : "+num);
	}
	
	static void print(float num) {
		System.out.println("Print Function with float arguement : "+num);
	}
	
	public static void main(String[] args) {
		int intNum = 5;
		float floatNum = 5f;
		print();
		print(intNum);
		print(floatNum);
	}
}
