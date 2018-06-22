package printGeneric;

import java.util.Scanner;

public class Print {
	
	public static <T> void print(T[] arr) {
		System.out.println();
		for(T element:arr) {
			System.out.println(element);
		}
		
	}
	
	public static void main(String[] args) {
		Integer[] arr1 = new Integer[2];
		Double[] arr2 = new Double[2];
		String[] arr3 = new String[2];
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter 2 integer elements : ");
		for(int i=0;i<2;i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter 2 double elements : ");
		for(int i=0;i<2;i++)
		{
			arr2[i] = sc.nextDouble();
		}
		
		
		System.out.println("Enter 2 strings : ");
		for(int i=0;i<2;i++)
		{
			arr3[i] = sc1.nextLine();
		}
		
		sc.close();
		sc1.close();
		
		print(arr1);
		print(arr2);
		print(arr3);
		
	}

}
