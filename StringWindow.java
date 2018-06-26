import java.util.Scanner;


public class StringWindow {
	
	public static void main(String[]  args) {
		String str2;
		int num;
		str2 = new String();
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		str2 = sc.nextLine();
		System.out.println(num);
		System.out.println(str2.length());
		
	}

}
