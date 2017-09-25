public class PizzaOrder
{
	private int numPizzas;
	private Pizza p1;
	private Pizza p2;
	private Pizza p3;
	
	public PizzaOrder()
	{
		numPizzas = 1;
		p1 = new Pizza();
		p2 = null;
		p3 = null;
	}
	
	public PizzaOrder(int orderNumPizzas, Pizza orderP1, Pizza orderP2,  Pizza orderP3)
	{
		numPizzas = orderNumPizzas;
		p1 = orderP1;
		p2 = orderP2;
		p3 = orderP3;
	}
	
	public PizzaOrder(PizzaOrder p)
	{
		this(p.getNumPizzas(), p.getP1(), p.getP2(), p.getP3());
	}
	
	public int getNumPizzas()
	{
		return numPizzas;
	}
	
	public Pizza getP1()
	{
		return p1;
	}
	
	public Pizza getP2()
	{
		return p2;
	}
	
	public Pizza getP3()
	{
		return p3;
	}
	
	public void setNumPizzas(int newNumPizzas)
	{
		numPizzas = newNumPizzas;
	}
	
	public void setP1(Pizza newP1)
	{
		p1 = newP1;
	}
	
	public void setP2(Pizza newP2)
	{
		p2 = newP2;
	}
	
	public void setP3(Pizza newP3)
	{
		p3 = newP3;
	}
	
	public double total()
	{
		double orderTotal = p1.cost();
		if(numPizzas >= 2)
			orderTotal += p2.cost();
		if(numPizzas >= 3)
			orderTotal += p3.cost();
		return orderTotal;
	}
	
	public boolean isEquals(Object o)
	{
		PizzaOrder oPizzaOrder = (PizzaOrder)o;
		
		return this.getNumPizzas() == oPizzaOrder.getNumPizzas() && 
		this.getP1() == oPizzaOrder.getP1() && this.getP2() == oPizzaOrder.getP2() && 
		this.getP3() == oPizzaOrder.getP3();
	}
	
	public String toString()
	{
		String pizzaString = "\n\nFirst pizza: " + p1 + "\n\nCost: $" + p1.cost() + 
		"\n_________________________________________________________________";
		if(numPizzas >= 2)
			pizzaString += "\n\nSecond pizza: " + p2 + "\n\nCost: $" + p2.cost()+ 
		"\n_________________________________________________________________";
		if(numPizzas >= 3)
			pizzaString += "\n\nThird pizza: " + p3 + "\n\nCost: $" + p3.cost()+ 
		"\n_________________________________________________________________";
		pizzaString += "\n\nTotal: $" + this.total();
		return pizzaString;
		
	}
	
}