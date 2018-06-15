package removeVowels;

import java.util.Scanner;

public class RemoveVowels {
	
	String str;
	int length;
	
	RemoveVowels() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		str = sc.nextLine();
		length = str.length();
		sc.close();
	}
	
	String removeVowels() {
		String strNoVowels = ""; 
		int i=0;
		while(i<length) {
			char ch = str.toLowerCase().charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') 
				strNoVowels = strNoVowels + str.charAt(i);
			i++;
		}
		return strNoVowels;
	}
	
	public static void main(String[] args) {
		RemoveVowels obj = new RemoveVowels();
		System.out.print(obj.removeVowels());
	}

}
