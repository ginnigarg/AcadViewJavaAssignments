import java.util.Scanner;

public class AddTwoNumbers {
	
	public static void input() {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		num2 = sc.nextInt();
		add(num1,num2);
	}
	
	public static void add(int num1,int num2) {
		int sum = num1 +num2;
		System.out.println("Sum is "+sum);
	}
	
	
	public static void main(String[] args) {
		input();
	}

}
