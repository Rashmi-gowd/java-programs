package assignment116;

public class Upcastingclass {
	
	public static void main(String[]args)
	{
		//Upcasting
		Object o1=new Upcastingclass();//Implicit syntax
		Object o2=(Object)new Upcastingclass();//Explicit syntax
		
		//Downcasting
		
		Object o3=new Upcastingclass();
		Upcastingclass u1=(Upcastingclass)o3;
	}

}
