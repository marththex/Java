public class Dog extends Pet
{
	
	public Dog()
	{
		super();
	}
	
	public Dog(String name, int age, double weight)
	{
		super(name, age, weight);
	}
	
	public double acepromazine()
	{
		double dousage = getWeight()/2.2*.03/10;
		return dousage;
	}
	
	public double carprofen()
	{
		double dousage = getWeight()/2.2*.05/12;
		return dousage;
	}
	
	
	
} 