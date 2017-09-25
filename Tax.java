import java.util.Scanner;
import java.text.DecimalFormat;

public class Tax
{
	public static void main(String[] args)
	{
		double price, tax, fPrice;
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("What is your subtotal?");
		System.out.println("Disregard the \"$\" symbol from your answer (e.g. Enter \"99.99\" for $99.00)");
		price = scan.nextDouble();
		System.out.println("How percentage is your state tax?");
		System.out.println("Disregard the percent sign from your answer (e.g. Enter \"10\" for 10%)");
		tax = scan.nextDouble();
		fPrice = price + (price*(.001*tax));
		System.out.println("Sub-total: $" + df.format(price));
		System.out.println("Tax: " + tax + "%");
		System.out.println("Total: $" + df.format(fPrice));		 
	}
}
