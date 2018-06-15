package subStringGeneration;

import java.util.Scanner;

public class SubstringGeneration {

	String str;
	int length;
	
	SubstringGeneration(String s) {
		str = s;
		length = str.length();
	}
	
	void generateSubstring() {
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<=length;j++)
			{
				System.out.println(str.substring(i,j));
			}
				
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		SubstringGeneration obj = new SubstringGeneration(str);
		obj.generateSubstring();
		sc.close();
	}

}
