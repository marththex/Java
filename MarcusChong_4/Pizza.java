public class Pizza
{
	private String size;
	private int cheese;
	private int pepperoni;
	private int ham;
	
	public Pizza()
	{
		size = "small";
		cheese = 0;
		pepperoni = 0;
		ham = 0;
	}
	
	public Pizza(String pizzaSize, int pizzaCheese, int pizzaPepperoni, int pizzaHam)
	{
		size = pizzaSize;
		cheese = pizzaCheese;
		pepperoni = pizzaPepperoni;
		ham = pizzaHam;
		
	}
	
	public Pizza(Pizza p)
	{
		this(p.getSize(),p.getCheese(), p.getPepperoni(),p.getHam());
	}
	
	public String getSize()
	{
		return size;
	}
	
	public int getCheese()
	{
		return cheese;
	}
	public int getPepperoni()
	{
		return pepperoni;
	}
	
	public int getHam()
	{
		return ham;
	}
	
	public void setSize(String newSize)
	{
		size = newSize;
	}
	
	public void setCheese(int newCheese)
	{
		cheese = newCheese;
	}
	
	public void setPepperoni(int newPepperoni)
	{
		pepperoni = newPepperoni;
	}
	
	public void setHam(int newHam)
	{
		ham = newHam;
	}
	
	public double cost()
	{
		if(size.equals("small"))
		{
			return 10 + 2*(cheese + pepperoni + ham);
		}
		
		if(size.equals("medium"))
		{
			return 12 + 2*(cheese + pepperoni + ham);
		}
		
		else
		{
			return 14 + 2*(cheese + pepperoni + ham);
		}
	}
	
	public boolean isEquals(Object o)
	{
		
		Pizza oPizza = (Pizza)o;
		return this.getSize() == oPizza.getSize() && this.getCheese() == oPizza.getCheese() && this.getPepperoni() == 
		oPizza.getPepperoni() && this.getHam() == oPizza.getHam();
			
	}
	
	public String toString()
	{
		return size + " pizza with " + cheese + " chesse, " + pepperoni + " pepperoni, and " + ham + " ham."; 
	}
}