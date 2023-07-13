package Activity02;

public class MainClass
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Rectangle r1 = new Rectangle(5,8);
		Rectangle r2 = new Rectangle(1,1);
				
		System.out.println("r1 area is: " + r1.calculateArea() + "\nr1 perimeter is: " + r1.calculatePerimeter());
		
		double arear2 = r2.calculateArea();
		double perimeterr2 = r2.calculatePerimeter();
		
		System.out.println("\nr2 area is: " + arear2 + "\nr2 perimeter is: " + perimeterr2);
				
	}

}
