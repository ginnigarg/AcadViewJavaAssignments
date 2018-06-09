import java.util.Scanner;

public class Pattern {
	public static void main(String[] args)
	{
		System.out.println("Enter the number of rows : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=0;j<=size-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
