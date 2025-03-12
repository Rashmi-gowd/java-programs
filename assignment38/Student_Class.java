package assignment38;
class Parentclass {
	void divide()
	{
		int a1=40;
		int b1=60;
		int divide=b1/a1;
		System.out.println(divide);
	}
}
public class Student_Class extends Parentclass
{
	void multiplication()
	{
		double d1=6000.50;
		int c1=40;
		double multiplication=d1*c1;
		System.out.println(multiplication);
	}
public static void main(String[]args)
	{
	Student_Class s1=new Student_Class();
	s1.divide();
	s1.multiplication();
	}
}
	


