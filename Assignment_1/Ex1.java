import java.util.Scanner;

public class HelloName
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is you name?");
		String name = scan.next();
		System.out.println("Hello " + name);
		
	}
}