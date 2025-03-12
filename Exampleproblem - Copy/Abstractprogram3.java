package Exampleproblem;
abstract class Abstractprogram2
{
	abstract void add();
	abstract void sub();

  void login() {
   System.out.println("logic to execute");
}
   static void logout()
{
	System.out.println("logic to execute");
}
}
public class Abstractprogram3 extends Abstractprogram2
{
	void add()
	{
		System.out.println("logic to execute");
	}
	void sub()
	{
		System.out.println("logic to execute");
	}
	public static void main(String[]args)
	{
	}
}




