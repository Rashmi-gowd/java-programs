package assignment117;
class Runtime_polymorphism2 {
	void browse()
	{
		System.out.println("browse some animated movies");
	}
}

public class  Runtime_polymorphism1 extends  Runtime_polymorphism2
{
	void browse()
	{
		System.out.println("browse some of the horror movies");
		super.browse();
	}
	public static void main(String[]args)
	{
		 Runtime_polymorphism1 m1=new   Runtime_polymorphism1();
		 m1.browse();
	}

}


