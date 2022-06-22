import java.util.Scanner;

public class simple_calculator
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);
		double a , b , total;
		
		System.out.print("Enter first number - ");
		a = myScanner.nextDouble();
		
		System.out.print("Enter second number - ");
		b = myScanner.nextDouble();
		
		total = a + b;
		
		System.out.println("Total is " + total);
		
	}
	
}