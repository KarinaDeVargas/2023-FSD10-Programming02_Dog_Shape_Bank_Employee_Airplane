package Activity06;

import java.time.LocalDateTime;

public class MainClass
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Airplane a1 = new Airplane(52148, "Toronto", LocalDateTime.of(2023, 06, 28, 14, 15));
		Airplane a2 = new Airplane(10258, "Vancouver", LocalDateTime.of(2023, 06, 28, 14, 50));
		Airplane a3 = new Airplane(79880, "Calgary",  LocalDateTime.of(2023, 06, 28, 14, 30));
		
		a1.info();
		a1.checkStatus();
		a2.info();
		a2.checkStatus();
		a3.info();
		a3.checkStatus();
		System.out.println("==========================================");
		
	}
}
