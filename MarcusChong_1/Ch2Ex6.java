import java.util.Scanner;

public class Ch2Ex6
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in); // New Scanner

		double numOfSweetToKillAMouse, gramsMouse = 25, gramsPersonDesire, gramsPersonInital = 250, percentSweetInSoda = .001;
		System.out.println("What the amount of nartificial sweetener needed to kill a mouse (disreguard units)?");
		numOfSweetToKillAMouse = scan.nextDouble();
		System.out.println("What is the desire weight of the dieter in grams (disreguard units)?");
		gramsPersonDesire = scan.nextDouble();
		double maxMouseCanDrink = numOfSweetToKillAMouse/percentSweetInSoda;
		double maxPersonCanDrink = maxMouseCanDrink*gramsPersonDesire/gramsMouse;
		
		System.out.println("The dieter can drink " + maxPersonCanDrink + " liters without dying.");

	}
}