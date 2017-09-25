public class Ch4Ex11
{
	public static void main(String[] args)
	{
		Pizza p1 = new Pizza("small", 1, 2, 3);
		Pizza p2 = new Pizza("medium", 2, 3, 4);
		Pizza p3 = new Pizza("large", 3, 4, 5);
		
		System.out.println("\n\n" + p1 + "\n");
		System.out.println("Pizza 1 cost: $" + p1.cost());
		System.out.println("___________________________________________________________\n");
		System.out.println(p2);
		System.out.println("\nPizza 2 cost: $" + p2.cost());
		System.out.println("___________________________________________________________\n");
		System.out.println(p3);
		System.out.println("\nPizza 3 cost: $" + p3.cost());
	}
	
}