package assignment76;
import java.util.Scanner;
public class Arrayvalue_runtimeprogram {
	public static void main(String[]args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter the size of the array");
		int age[]=new int[s1.nextInt()];
		for(int i=0; i<age.length; i++) 
		{
			System.out.println("please enter the value at the Index" +i);
			age[i]=s1.nextInt();
			
		}
		
	}

}
