package adc51;
class Student3 {
void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
   void mul()
{
	int a=20;
	int b=20;
	int mul=a*b;
	System.out.println(mul);
}
}
public class Student2 extends Student3
{
    static Student2 s1;
	void sub()
	{
		int a=100;
		int b=10;
        double sub=a-b;
		System.out.println(sub);
	}
	public static void main(String[]args)
	{
		Student2.s1=new Student2();
		s1.add();
		s1.mul();
		s1.sub();
		}
	 }


