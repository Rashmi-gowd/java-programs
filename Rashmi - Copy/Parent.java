package Rashmi;
class Parent {
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
class Student_class extends Parent
{
	void disp3()
	{
		System.out.println("Rama, sita, ravana");
	}
}
class Demo{
public static void main(String[]args)
{
	Student_class c=new Student_class();
	c.disp1();
	c.disp2();
	c.disp3();
}
}
