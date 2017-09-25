public class Cat extends Pet
{
	public Cat()
	{
		super();
	}
	
	public Cat(String name, int age, double weight)
	{
		super(name, age, weight);
	}
	
	public double acepromazine()
	{
		double dousage = getWeight()/2.2*.002/10;
		return dousage;
	}
	
	public double carprofen()
	{
		double dousage = getWeight()/2.2*.25/12;
		return dousage;
	}
}