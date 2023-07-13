package Activity05;

import java.time.LocalDate;
import java.time.Period;

public class Employee // class or blueprint
{
	
	private String fullName;
	private double salary; // creating the attributes or properties 
	private LocalDate hireDate;
		
	public Employee(String fullName, double salary, LocalDate hireDate) //constructor
	{
		this.fullName = fullName;
		this.salary = salary;
		this.hireDate = hireDate;
	}	
	
	public String getFullName()
	{
		return fullName;
	}
	
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
	
	public double geSalary() 
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public LocalDate getHireDate()
	{
		return hireDate;
	}
	
	public void setHireDate(LocalDate hireDate)
	{
		this.hireDate = hireDate;
	}
	
	public int calculateYearsOfService() //
	{
		return Period.between(hireDate, LocalDate.now()).getYears();
	}
	
	public void info()
	{
		System.out.println("==========================================");
		System.out.println("Employee Full Name: " + fullName);
		System.out.println("Employee Salary: $" + salary);
		System.out.println("Employee Hire Date: " + hireDate);		
	}
	
	//compare the objects with equal method
		public boolean equals(Employee e)
		{
			if (this.fullName == e.fullName && this.salary == e.salary)				
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}
