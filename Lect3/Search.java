import java.util.Scanner;

public class Search {
	
	public static boolean search(int[] arr,int number)
	{
		int start = 0, end = arr.length - 1;
        while (start <= end)
        {
            int mid = start + (end-start)/2;
            if (arr[mid] == number)
                return true;
            
            if (arr[mid] < number)
                start = mid + 1;
            else
                end = mid - 1;
        }
		return false;
	}
	
	public static void main(String[] args)
	{
		int [] arr = new int[]{1,4,6,7,8,9,10};
		System.out.print("Enter the number to search in array : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(search(arr,number))
			System.out.println(number + " found");
		else
			System.out.println(number + " not found");
		sc.close();

	}
}
