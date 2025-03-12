package assignment11;
class Student3{
	static void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
}
public class Student2 extends Student3
{
	static void sub()
	{
		double a=3.4;
		int c=10;
		double sub=a-c;
		System.out.println(sub);
	}
	public static void main(String[]args)
	{
		add();
		sub();
	}
}


