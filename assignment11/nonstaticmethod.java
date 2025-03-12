package assignment11;
public class nonstaticmethod {
	void add()
		{
			int a=70;
			int b=30;
			System.out.println(a+b);
		}
		void sub()
		{
			int a=900;
			int b=100;
			System.out.println(a-b);
		}
		void mul()
		{
			int a=900;
			int b=200;
			System.out.println(a*b);
			}
		public static void main(String[]args)
		{
			nonstaticmethod n=new nonstaticmethod();
			n.add();
			n.sub();
			n.mul();
		}
		
	}


