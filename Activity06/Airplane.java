package Activity06;

import java.time.Duration;
import java.time.LocalDateTime;

public class Airplane // class or blueprint // methods to check flight status and delay.  
{
	
	private int flightNumber;
	private String destination; // creating the attributes or properties 
	private LocalDateTime departureTime;
		
	public Airplane(int flightNumber, String destination, LocalDateTime departureTime) //constructor
	{
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.departureTime = departureTime;
	}	
	
	public int getFlightNumber()
	{
		return flightNumber;
	}
	
	public void setFlightNumber(int flightNumber)
	{
		this.flightNumber = flightNumber;
	}
	
	public String geDestination() 
	{
		return destination;
	}
	
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	
	public LocalDateTime getDepartureTime()
	{
		return departureTime;
	}
	
	public void setDepartureTime(LocalDateTime departureTime)
	{
		this.departureTime = departureTime;
	}
	
	public void checkStatus() 
	{
		LocalDateTime departure = LocalDateTime.of(2023, 06, 28, 14, 05); // considering all flights had departure at 14:05
		if (departure == getDepartureTime())
		{
			System.out.println("Flight had departure on time");
		}
		else 
		{
			Duration delay = Duration.between(getDepartureTime(), departure);
			System.out.println("Flight had departure late. Delay: " + delay );
		}
	}
	
	public void info()
	{
		System.out.println("==========================================");
		System.out.println("Flight number: " + flightNumber);
		System.out.println("Flight destination: " + destination);
		System.out.println("Flight departure: " + departureTime);		
	}
	
}
