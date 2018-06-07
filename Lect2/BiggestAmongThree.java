import java.util.Scanner;

public class BiggestAmongThree {
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the third number : ");
		int num3 = sc.nextInt();
		checkBiggest(num1,num2,num3);
	}
	
	public static void checkBiggest(int num1,int num2,int num3) {
		int large;
		if(num1>num2){
			if(num1>num3)
			{
				large=num1;
			} else if(num2>num3) {
				large=num2;
			} else {
				large=num3;
			}
		} else {
			if(num2>num3)
			{
				large=num2;
			} else if(num1>num3) {
				large=num1;
			} else {
				large=num3;
			}
		}
		System.out.print("Biggest number is "+large);
	}
	public static void main(String[] args) {
		input();
	}
}
