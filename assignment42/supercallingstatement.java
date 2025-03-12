package assignment42;

public class supercallingstatement {
	class Meesho1
	{
	Meesho1()
	{
		System.out.println("this is parent class");
	}
	}
	public class Meesho extends Meesho1
	{
		Meesho()
		{
			super();
			System.out.println("this is child class");
		}
		public void main(String[]args)
		{
		new Meesho();	
	}
	}

}
