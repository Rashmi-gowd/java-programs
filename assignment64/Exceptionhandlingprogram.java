package assignment64;

public class Exceptionhandlingprogram {
	public static void main(String[]args)
	{
		try
		{
			int a=1/0;
			System.out.println("execute the try block please");
		}
		catch(ArithmeticException b1)
		{
			System.out.println("execute the catch block please");
		}
		finally
		{
			System.out.println("execute the finally block please");
		}
	
	}

}
