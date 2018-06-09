import java.util.Scanner;

public class PrimeNumbersUptoN {
	
	public static boolean isPrime(int number)
	{
		for(int i=2;i<=Math.sqrt(number);i++)
		{
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the value of n : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i=2;i<=size;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}
