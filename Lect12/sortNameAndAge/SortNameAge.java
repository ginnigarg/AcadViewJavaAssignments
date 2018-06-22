package sortNameAndAge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNameAge {
	
	static ArrayList<Details> arr = new ArrayList<Details>();
	
	public static void fillDetails() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String str;
		Integer num;
		System.out.println("IN ORDER TO STOP ENTERING, ENTER NAME AS quit");
		System.out.println("Enter the name : ");
		while(!((str = sc1.nextLine()).equals("quit"))) {
			System.out.println("Enter the age : ");
			num = sc2.nextInt();
			arr.add(new Details(str,num));
			System.out.println("Enter the name : ");
		}
		sc1.close();
		sc2.close();
	}
	
	public static void sortByName() {
		Collections.sort(arr,new sortName());
	}
	
	public static void sortByAge() {
		Collections.sort(arr,new sortAge());
	}
	
	public static void print(){
		for(Details object:arr) {
			System.out.println("Name : "+object.name+" Age : "+object.age);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		fillDetails();
		sortByName();
		System.out.println("List Sorted by Name : ");
		print();
		sortByAge();
		System.out.println("List Sorted By Age : ");
		print();
	}

}
