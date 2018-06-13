package SubArray;

import java.util.Scanner;

public class SubArray {
	
	public static int maxSubarray(int[] arr) {
		
		int size=arr.length;
		int []arr_count = new int[size];
		for(int i=0;i<size;i++)
		{
			arr_count[i] = 1;
		}
		for(int i=0;i<size-1;i++)
        	{
			for(int j=i;j<size-1;j++)
			{
				if(arr[j]<arr[j+1])
            				arr_count[i]++;
            			else
            				break;
            		}

        	}

        	int max=arr_count[0];
        	for(int i=0;i<size;i++)
        	{
        		if(arr_count[i]>max)
                		max=arr_count[i];
        	} 
        	return max;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size =sc.nextInt();
		int []arr = new int[size];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Size of max Subarray is : "+maxSubarray(arr));
		sc.close();
		
	}
}
