import java.util.Scanner;


public class Rectangle {
	int length;
	int breadth;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int CalculateArea()
	{
		return(length*breadth);
	}

	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle();
		int length,breadth;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the length : ");
		length = sc.nextInt();
		System.out.print("Enter the breadth : ");
		breadth = sc.nextInt();
		rect.setLength(length);
		rect.setBreadth(breadth);
		System.out.println("Area of Recangle is : "+rect.CalculateArea());
		sc.close();
	}
}
