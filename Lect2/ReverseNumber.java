import java.util.Scanner;


public class ReverseNumber {
	public static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number  : ");
		return(sc.nextInt());
	}
	
	public static int reverse(int num) {
		int rev=0,temp=num,remainder;
		while(temp > 0){
			remainder = temp%10;
			rev = (rev*10) + remainder;
			temp/=10;
		}
		return rev;
	}
	
	public static void print(int num) {
		System.out.print(num+" is the reversed number.");
	}
	
	public static void main(String[] args) {
		int number=input();
		int rev = reverse(number);
		print(rev);
	}
}
