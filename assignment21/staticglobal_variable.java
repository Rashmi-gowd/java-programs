package assignment21;

public class staticglobal_variable {
	double f=0.5;
	static double base=20;
	static double height=10;
	public static void main(String[]args)
	{
		System.out.println("the area of the triangle:");
		staticglobal_variable s=new staticglobal_variable ();
		double area=0.5*base*height;
		System.out.println(area);
		
	}
	
}
