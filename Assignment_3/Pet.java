public abstract class Pet
{
	private  String name;
	private int age;
	private double weight;
	
	public Pet()
	{
		name = null;
		age = 0;
		weight = 0;
	}
	
	public Pet(String petName, int petAge, double petWeight)
	{
		name = petName;
		age = petAge;
		weight = petWeight;
	}
	
	public Pet(Pet p)
	{
		this(p.getName(), p.getAge(), p.getWeight());
	}
	
	public void setName(String petName)
	{
		name  = petName;
	}
	
	public void setAge(int petAge)
	{
		age = petAge;
	}
	
	public void weight(double petWeight)
	{
		weight = petWeight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public String toString()
	{
		return "Name: " + name + " Age: " + age + " years  Weight: " + weight + " lb.";    
	}

	public abstract double acepromazine();
	
	public abstract double carprofen();
	
}