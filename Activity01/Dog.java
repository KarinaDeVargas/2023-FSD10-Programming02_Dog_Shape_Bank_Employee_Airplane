package Activity01;

public class Dog // my class - blueprint
{

	private String name; // attributes or properties (criando as propriedades da classe)
	private String breed; // attributes or properties
	
	//creating the constructor with set attributes
	public Dog()
	{
		this.name = "hereEnterName";
		this.breed = "hereEnterBreed";
	}
	
	//creating the constructor to enter attributes (pass variable to constructor)
	public Dog(String name, String breed) // important to be same name as class "Dog" - arguments to pass in 
	{
		this.name = name;
		this.breed = breed;
	}
	
	public String getName()
	{
		return this.name;
	}

	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public String getBreed()
	{
		return this.breed;
	}
		
	public void setBreed(String newBreed)
	{
		this.breed = newBreed;
	}
	
	//creating a method to print updates values of attributes/properties (name and breed)
	public void printUpdatedValues()
	{
		System.out.println("The dog name is: " + name + " and the breed is: " + breed);
	}
	
	//compare the objects with equal method
	public boolean equals(Dog instanceDog)
	{
		if (this.name == instanceDog.name && this.breed == instanceDog.breed)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void equals02(Dog instanceDog)
	{
		if (this.name == instanceDog.name && this.breed == instanceDog.breed)
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("false");
		}
	}
	
}
