import java.util.Scanner;

public class Palindrome {
	public static void input() {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		checkPalindrome(num);		
	}
	
	public static void checkPalindrome(int num) {
		int rev=0,temp=num,remainder;
		while(temp > 0){
			remainder = temp%10;
			rev = (rev*10) + remainder;
			temp/=10;
		}
		if(rev == num) {
			System.out.print(num+" is palindrome.");
		} else {
			System.out.print(num+" is not palindrome.");
		}
		
	}
	public static void main(String[] args) {
		input();
	}
}
