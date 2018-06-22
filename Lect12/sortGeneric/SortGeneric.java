package sortGeneric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortGeneric {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		Integer num;
		System.out.println("Enter the integer values and -1 to quit : ");
		while((num = sc1.nextInt()) != -1) {
			arr1.add(num);
		}
		
		String str;
		System.out.println("Enter the strings and quit to quit : ");
		while(!((str = sc1.nextLine()).equals("quit"))) {
			arr2.add(str);
		}
		
		sc1.close();
		sc2.close();
		
		Collections.sort(arr1);
		Collections.sort(arr2);
		
		System.out.println("Integers in Sorted order");
		
		for(Integer element:arr1) {
			System.out.println(element);
		}
		
		System.out.println("Strings in Sorted order");
		
		for(String element:arr2) {
			System.out.println(element);
		}
	}

}
