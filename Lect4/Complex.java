import java.util.Scanner;


public class Complex {
	int real;
	int imag;
	
	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImag() {
		return imag;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}
	
	public void Display() {
		if (imag>=0)
			System.out.print(real+"+"+imag+"i");
		else
			System.out.print(real+""+imag+"i");
	}

	public static void main(String[] args)
	{
		Complex num = new Complex();
		Scanner sc = new Scanner(System.in);
		int real,imag;
		real = sc.nextInt();
		imag = sc.nextInt();
		num.setReal(real);
		num.setImag(imag);
		num.Display();
		sc.close();
	}

}
