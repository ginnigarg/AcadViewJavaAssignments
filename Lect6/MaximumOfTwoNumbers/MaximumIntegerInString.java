package MaximumOfTwoNumbers;

import java.util.Scanner;

public class MaximumIntegerInString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1,string2;
		int num1,num2,greatest;
		
		System.out.print("Enter the first number : ");
		string1 = sc.nextLine();
		System.out.print("Enter the second number : ");
		string2 = sc.nextLine();
		sc.close();
		
		num1 = Integer.parseInt(string1);
		num2 = Integer.parseInt(string2);
		greatest = (num1>num2)?(num1):(num2);
		
		System.out.println(greatest+" is bigger");
	}

}
