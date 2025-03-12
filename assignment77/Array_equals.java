package assignment77;
import java.util.Scanner;
public class Array_equals {
	public static void main(String[]args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter the size of the 1st array");
		System.out.println("enter the 1 element for 1st array");
		Scanner s2=new Scanner(System.in);
		System.out.println("please enter the size of the 2nd array");
		System.out.println("enter the 1 element for 2nd array");
		int age[]=new int[s1.nextInt()];
		int age1[]=new int[s2.nextInt()];
		
		for(int i=0,j=0; i<age.length; i++,j++)
			
			{
			age[i]=s1.nextInt();
			age1[j]=s1.nextInt();
			if(age[i]==age1[j])
			{
				System.out.println("both the array are equals to eact other");	
		}
			else
			{
				System.out.println("both the array are not equals to eact other");
			s1.close();
			s2.close();
			}
	}
  }
}


