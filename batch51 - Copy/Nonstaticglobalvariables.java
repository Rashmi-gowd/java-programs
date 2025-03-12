package batch51;

public class Nonstaticglobalvariables {
	double d=0.5;
	static double base=20;
	static double height=10;
	
public static void main(String[]args)
	{
		System.out.println("the area of the triangle:");
		Nonstaticglobalvariables n=Nonstaticglobalvariables();
		double area=0.5*base*height;
		System.out.println(area);    
		}

static Nonstaticglobalvariables Nonstaticglobalvariables() {
	return null;
}
}



