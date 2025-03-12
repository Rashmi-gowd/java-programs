package assignment16;
public class method_overloading {
	void sub(int a, int c)
	{
		System.out.println("1");
	}
	void sub(long a,double b)
	{
		System.out.println("2");
    }
	void sub(boolean c,int b)
	{
		System.out.println("3");
	}
	public static void main(String[]args)
	{
		method_overloading n=new method_overloading();
	   n.sub(50,90);
	   n.sub(1234567,2.56);
	   n.sub(true,80);
	   }
}
