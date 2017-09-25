import java.util.Scanner;

public class Sum
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in the first number.");
		int first = scan.nextInt();
		System.out.println("Type in the second number.");
		int second = scan.nextInt();
		System.out.println("The sum of those two numbers is " + (first + second) + ".");
		
	}
}