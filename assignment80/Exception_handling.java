package assignment80;

public class Exception_handling {
public static void main(String[]args)throws ArrayIndexOutOfBoundsException
	{
		int rollno[]=new int[3];
		rollno[0]=58;
		rollno[1]=78;
		rollno[2]=98;
	
		try
		{
			for(int i=0; i<rollno.length; i++)
			{
				rollno[3]=77;
				System.out.println(rollno[i]);
			}
		}
		
			catch(ArrayIndexOutOfBoundsException c1)
			{
				System.out.println("exception solved");
			}
	}
}
	


