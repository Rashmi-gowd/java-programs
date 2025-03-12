package assignment60;

public class SIB_program 
 {
	static 
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		System.out.println("execute the SIB Block");
	}
	{
		int a=30;
		int b=20;
		int sub=a-b;
		System.out.println(sub);
		System.out.println("execute the IIB Block");
	}
	public static void main(String[]args)
	{
		System.out.println("execute the Main Method");
		new SIB_program();
	}

}
