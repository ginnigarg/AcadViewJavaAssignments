package stringOccurance;

import java.util.Scanner;

public class StringOccurance {
	
	String mainString,substring;
	
	StringOccurance() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		mainString = sc.nextLine();
		System.out.print("Enter the second string : ");
		substring = sc.nextLine();
		sc.close();
	}
	
	boolean check() {
		return (mainString.contains(substring));
	}
	public static void main(String[] args) {
		StringOccurance obj = new StringOccurance();
		System.out.print("Does "+obj.mainString + " contain "+obj.substring +" : " + obj.check());
	}

}
