import java.util.Scanner;

public class LeapYear {
	
		public static void input() {
			int year;
			System.out.print("Enter the year : ");
			Scanner sc = new Scanner(System.in);
			year = sc.nextInt();
			checkLeap(year);
		}
		
		public static void checkLeap(int year) {
			if(year%4 == 0)
		    {
		        if( year%100 == 0)
		        {
		            if (year%400 == 0)
		                System.out.println(year+" is a leap year.");
		            else
		            	System.out.println(year+" is not a leap year.");
		        }
		        else
		        	System.out.println(year+" is a leap year.");
		    } else {
		    	System.out.println(year+" is not a leap year.");
		    }
		}
		
		public static void main(String[] args) {
			input();
		}
		
}
