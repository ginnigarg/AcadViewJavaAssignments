import java.util.Scanner;

public class ReverseNumber {
	public static int reverse(int number)
	{
		int rev=0;
		while(number>0)
		{
			rev= (rev*10) +(number%10);
			number/=10;
		}
		return rev;
	}
	public static void main(String[] args)
	{
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print("Reversed number is : "+reverse(number));
	}
}
