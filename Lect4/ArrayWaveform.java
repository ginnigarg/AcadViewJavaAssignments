import java.util.Scanner;

public class ArrayWaveform {
	
	public static void sortArray(int[] arr,int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void swapArray(int[] arr,int size)
	{
		for(int i=0;i<size;i+=2)
		{
			swapElements(arr,i,i+1);
		}
	}
	
	public static void swapElements(int[] arr,int start,int end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	
	public static void displayArray(int[] arr,int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] ={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		sortArray(arr,10);
		swapArray(arr,10);
		displayArray(arr,10);
		sc.close();
	}

}
