package Activity03;

public class MainClass
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Circle c1 = new Circle(5);
		Circle c2 = new Circle(11);
		Circle c3 = new Circle();
				
		System.out.println("Circle 1 area is: " + c1.calculateArea() + "\nCircle 1 circunference is: " + c1.calculateCircunference());
		
		double areac2 = c2.calculateArea();
		double circunferencec2 = c2.calculateCircunference();
		
		System.out.println("\nCircle 2 area is: " + areac2 + "\nCircle 2 circunference is: " + circunferencec2);
		System.out.println();
		System.out.println("=================");
		System.out.println("Circle 3");
		
		c3.setRadius(7);		
		double areac3 = c3.calculateArea();
		double circunferencec3 = c3.calculateCircunference();
		c3.info(areac3, circunferencec3);
	}
}
