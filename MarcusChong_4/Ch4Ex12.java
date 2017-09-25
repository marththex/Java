public class Ch4Ex12
{
	public static void main(String[] args)
	{
		Pizza p1 = new Pizza("small", 1, 2, 3);
		Pizza p2 = new Pizza("medium", 2, 3, 4);
		Pizza p3 = new Pizza("large", 3, 4, 5);
		
		PizzaOrder order = new PizzaOrder(3, p1, p2, p3);
		
		System.out.println(order);
	}
	
}