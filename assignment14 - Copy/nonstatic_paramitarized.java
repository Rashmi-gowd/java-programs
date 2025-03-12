package assignment14;
public class nonstatic_paramitarized {
	static void add(int c,int b)
	{
		System.out.println("c+b");
	}
	static void sub(long a,double c)
	{
		System.out.println("a-c");
	}
	static void mul(int a,double b)
	{
		System.out.println("a*b");
	}
	public static void main(String[]args)
	{
		add(80, 90);
	   sub(123456, 2.5555);
	  mul(800, 8.555);
		
	}
}


