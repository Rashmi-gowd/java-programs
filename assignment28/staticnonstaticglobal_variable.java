package assignment28;

public class staticnonstaticglobal_variable {
	int a=100; //global variable
	static double c=3.5;
	public static void main(String[]args)
	{
		c=3.5;
		System.out.println(c);
		staticnonstaticglobal_variable s=new staticnonstaticglobal_variable();
		s.a=100;
		System.out.println(s.a);
		
	}

}
