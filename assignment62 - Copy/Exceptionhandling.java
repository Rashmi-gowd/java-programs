package assignment62;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exceptionhandling 
{
	public static void main(String[]args) 
	{
		try
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("please enter your age");
			int age=s1.nextInt();
		}
	
		catch(InputMismatchException a1)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("please enter your age and must be only the number");
			int age=s1.nextInt();
		}
		catch(NullPointerException b2)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("please enter your age and must be only the number");
			int age=s1.nextInt();
		}
	}
}

	


