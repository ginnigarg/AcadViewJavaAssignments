import java.util.Scanner;

public class EvenNumbers {
	
	public static boolean isEven(int number)
	{
		return (number%2 == 0);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the value of n : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			if(isEven(i))
			{
				System.out.println(i);
			}
		}
		sc.close();
	}

}
