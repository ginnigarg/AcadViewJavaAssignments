import java.util.Scanner;

public class SecondLargest {
	
	public static void sortArray(int []arr,int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		sortArray(arr,10);
		System.out.print("Second largest number in array : "+arr[1]);
		sc.close();
	}

}
