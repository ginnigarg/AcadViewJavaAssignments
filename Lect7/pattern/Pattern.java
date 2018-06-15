package pattern;

public class Pattern {

	public static void main(String[] args) {
		char ch = 'a';
		for(int i=0;i<3;i++)
		{
			ch = 'a';
			for(int j=2;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}
