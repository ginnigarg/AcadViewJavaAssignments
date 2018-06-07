import java.util.Scanner;


public class PrimeNumber {
	
	public static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		return (sc.nextInt());  
	}
	
	public static boolean checkPrime(int num) {
		for(int i=2;i<=(num/2);i++)
		{
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args ) {
		int number = input();
		if(checkPrime(number)) {
			System.out.print(number+" is prime.");
		} else {
			System.out.print(number+" is not prime.");
		}
	}

}
