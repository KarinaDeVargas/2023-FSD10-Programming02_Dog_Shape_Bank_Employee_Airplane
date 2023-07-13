package Activity01;

public class MainClass // Demo
{

	public static void main(String[] args)
	{
		
		Dog d1 = new Dog("Robert", "Bulldog"); //creates the object "instanceDog01" using the class "Dog" passing in the arguments			
		Dog d2 = new Dog("Ann", "Golden Retrivier"); //
		
		d1.setName("John");
		d1.setBreed("Husky");
		
		d2.setName("Lili");
		d2.setBreed("Yorkshire");
		
		d1.printUpdatedValues();
		d2.printUpdatedValues();
		
		//int[] array1 = new int[] {1, 2, 3, 4};
		Dog[] arrayDogs = new Dog[] {d1, d2};
		
		boolean result = d1.equals(d2);
		
		System.out.print(result);		
	}
}
