package stringReverse;

import java.util.Scanner;

public class StringReverse {
	
	public static String reverseString(String str,String rev,int length) {
		if(length<0) {
			return rev;
		} else {
			rev = rev + str.charAt(length);
		}
		return reverseString(str,rev,--length);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str = sc.nextLine();
		String rev = "";
		rev = reverseString(str,rev,str.length()-1);
		System.out.println("Reversed String is :"+rev);
		sc.close();
	}

}
