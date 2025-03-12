package assignment48;
class Chrome_auth
{
	final void browse()
	{
		System.out.println("browse some animated movies");
	}
}

public class Methodoverride1 extends Chrome_auth
{
	void browse_tosearch_horrormovies()
	{
		System.out.println("browse some of the horror movies");
		
	}
	public static void main(String[]args)
	{
		 Methodoverride1 m1=new  Methodoverride1();
		 m1.browse();
		 }
}



