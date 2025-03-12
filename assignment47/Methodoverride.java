package assignment47;
class Chrome_auth
{
	void browse()
	{
		System.out.println("browse some animated movies");
	}
}

public class Methodoverride extends Chrome_auth
{
	void browse()
	{
		System.out.println("browse some of the horror movies");
		super.browse();
	}
	public static void main(String[]args)
	{
		 Methodoverride m1=new  Methodoverride();
		 m1.browse();
	}
}
