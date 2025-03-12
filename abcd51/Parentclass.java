package abcd51;
class childclass {
	void disp1()
	{
		System.out.println("Inside disp1 and Iam in parent");
	}
	void disp2()
	{
		System.out.println("Riya, Manu, Rashmi");
	}
	void disp3()
	{
		System.out.println("Inside parent disp3");
	}
}
class Parentclass extends childclass
{
	void disp4()
	{
		System.out.println("Rama, sita, ravana");
	}
public static void main(String[]args)
{
	Parentclass c=new Parentclass();
	c.disp1();
	c.disp2();
	c.disp3();
	c.disp4();
	
		}
}





