package Activity05;

import java.time.LocalDate;

public class MainClass
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Karina de Vargas", 52148.22, LocalDate.parse("2019-08-01"));
		Employee e2 = new Employee("John Abbott", 10258.98, LocalDate.parse("2004-05-01"));
		Employee e3 = new Employee("Karina de Vargas", 52148.22, LocalDate.parse("2019-08-01"));
		Employee e4 = new Employee("Ben MacDonald", 587.36, LocalDate.parse("2023-01-01"));
		
		e1.info();
		System.out.println("Total of Years of Service: " + e1.calculateYearsOfService() + " year(s)");
		e2.info();
		System.out.println("Total of Years of Service: " + e2.calculateYearsOfService() + " year(s)");
		e3.info();
		System.out.println("Total of Years of Service: " + e3.calculateYearsOfService() + " year(s)");
		e4.info();
		System.out.println("Total of Years of Service: " + e4.calculateYearsOfService() + " year(s)");
		System.out.println("==========================================");
		
		//int[] array1 = new int[] {1, 2, 3, 4};
		Employee[] arrayEmployee = new Employee[] {e1, e2, e3, e4};
		
		if (e1.equals(e2) == true) 
		{
			System.out.println("Employee 1 and Employee 2 are equals");
		}
		else 
		{
			System.out.println("Employee 1 and Employee 2 are NOT equals");
		}
		
		if (e1.equals(e3) == true) 
		{
			System.out.println("Employee 1 and Employee 3 are equals");
		}
		else 
		{
			System.out.println("Employee 1 and Employee 3 are NOT equals");
		}
		
		if (e1.equals(e4) == true) 
		{
			System.out.println("Employee 1 and Employee 4 are equals");
		}
		else 
		{
			System.out.println("Employee 1 and Employee 4 are NOT equals");
		}
		
		if (e2.equals(e3) == true) 
		{
			System.out.println("Employee 2 and Employee 3 are equals");
		}
		else 
		{
			System.out.println("Employee 2 and Employee 3 are NOT equals");
		}
		
		if (e2.equals(e4) == true) 
		{
			System.out.println("Employee 2 and Employee 4 are equals");
		}
		else 
		{
			System.out.println("Employee 2 and Employee 4 are NOT equals");
		}
		
		if (e3.equals(e4) == true) 
		{
			System.out.println("Employee 3 and Employee 4 are equals");
		}
		else 
		{
			System.out.println("Employee 3 and Employee 4 are NOT equals");
		}
	
	}
}
