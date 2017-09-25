import java.util.Scanner;
import java.io.BufferedReader;
import java.io.ImportReader;
import java.io.IOException;

public class ConsoleInput
{
	public void main(String[] argv)
	{
		/*Scanner scan = new Scanner(System.in);
		String userInput = "";
		System.out.println("Enter your name");
		userInput = s.nextLine();
		
		System.out.println("you entered " + userIput)
		
		System.out.println("Enter a number);
		int num= s.nextInt();
		
		System.out.println("you entered: " num*4);*/
		
		try
		{	

		BufferReader br = new Bufferedreader(new ImputStreamReader(System.in));
		String userInput = "";
		System.out.println("Enter your name");
		userInput = s.nextLine();
		
		System.out.println("you entered " + userIput)
		
		System.out.println("Enter a number);
		int num= s.nextInt();
		
		System.out.println("you entered: " num*4);
		
		catch(IOException ex)
		{
			ex.getMessage();
			System.out.println("error by rene german");
		}
	}
}
