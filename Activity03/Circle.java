package Activity03;

public class Circle // class or blueprint
{
	
	private int radius; // creating the attributes or properties 
		
	public Circle() 
	{
		this.radius = 0;
	}
	
	public Circle(int radius) //constructor
	{
		this.radius = radius;	
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	public void setRadius(int radius)
	{
		if(radius > 0)
		{
			this.radius = radius;
		}
		else
		{
			System.out.println("Please enter a positive integer.");
		}
	}
	
	public double calculateArea() // A = Math.pi * radius * radius
	{
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public double calculateCircunference() // C = 2 * Math.pi * radius
	{
		double circunference = 2 * Math.PI * radius;
		return circunference;
	}

	public void info(double circunference, double area)
	{
		System.out.println("Circle area is: " + area + "\nCircle circunference is: " + circunference);
	}

}
