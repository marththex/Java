import java.util.Scanner;

public class College
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the number fo college units you hava completed?");
		int units = scan.nextInt();
		if(units < 0)
		{
			System.out.println("Your input is invalid.");
		}
		else
		{
			if( units <= 30)
			{
				System.out.println("You are a Freshman");	
			}	
			if( units > 30 && units <= 60)
			{
				System.out.println("You are a Sophmore");	
			}
			if( units > 60 && units <= 90)
			{
				System.out.println("You are a Junior");	
			}
			if( units > 90)
			{
				System.out.println("You are a Senior");	
			}
		}
		
		
	}
}