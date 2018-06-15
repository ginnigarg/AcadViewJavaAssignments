package NumberOfWords;

import java.util.Scanner;

public class NumberOfWords {
	
	String str;
	int length;
	NumberOfWords() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		str = sc.nextLine();
		sc.close();
		length = str.length();
	}

	int countWhiteSpace() {
		int i=0,count=0;
		while(i<length) {
			if (str.charAt(i) == ' ')
				count++;
			i++;
		}
		return count;
	}
	public static void main(String[] args) {
		NumberOfWords obj = new NumberOfWords();
		int numberOfWords = obj.countWhiteSpace() + 1;
		System.out.print("Number of Words : "+numberOfWords);

	}

}
