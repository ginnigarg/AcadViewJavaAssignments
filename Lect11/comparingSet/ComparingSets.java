package comparingSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ComparingSets {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		String str = "quit";
		
		System.out.println("Enter the Elements in set1 and quit to stop entering : ");
		String str1 = sc.nextLine();
		while(!(str1.equals(str))) {
			set1.add(str1);
			str1 = sc.nextLine();
		}
		
		System.out.println("Enter the Elements in set2 and quit to stop entering : ");
		str1 = sc.nextLine();
		while(!(str1.equals(str))) {
			set2.add(str1);
			str1 = sc.nextLine();
		}
		
		sc.close();
		
		System.out.println("The elements of set 1 are : "+set1);
		System.out.println("The elements of set 2 are : "+set2);
		set1.retainAll(set2);
		
		System.out.println("The common elements are : "+set1);
	}

}
