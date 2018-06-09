import java.util.Scanner;

public class ArmstrongNumber {
	
	public static int numberOfDigits(int number)
	{
		int count=0;
		while(number!=0)
		{
			count++;
			number/=10;
		}
		return count;
	}
	
	public static boolean isArmstrong(int number)
	{
		int digitCount = numberOfDigits(number);
		int temp = number;
		int sum=0;
		while(temp>0)
		{
			sum+= Math.pow(temp%10, digitCount);
			temp/=10;
		}
		return (sum == number);
	}
	
	public static void main(String[] args)
	{
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(isArmstrong(number))
			System.out.println(number + " is Armstrong");
		else
			System.out.println(number + " is not Armstrong");
		sc.close();
	}
}
