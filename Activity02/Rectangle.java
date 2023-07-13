package Activity02;

public class Rectangle // class or blueprint
{
	
	private int width; // attributes or properties 
	private int height; // attributes or properties
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public double calculateArea()
	{
		double area = width * height;
		return area;
	}
	
	public double calculatePerimeter()
	{
		double perimeter = 2 * (width * height);
		return perimeter;
	}
}
