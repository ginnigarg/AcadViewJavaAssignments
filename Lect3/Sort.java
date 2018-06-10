
public class Sort {
	
	sort(int[] arr)
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
	}
	
	public static void main(String[] args)
	{
		int [] arr = new int[]{1,1,1,1,0,0,1,0};
		sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
}
