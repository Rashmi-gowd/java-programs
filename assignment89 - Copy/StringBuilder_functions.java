package assignment89;

public class StringBuilder_functions {
	public static void main(String[]args)
	{
	StringBuilder s1=new StringBuilder("Riya");
	s1.append(" Manu rashmi");
	System.out.println(s1);
	StringBuilder s2=new StringBuilder("riya manu rashmi");
	System.out.println(s2.insert(4, " manu"));
	StringBuilder s3=new StringBuilder("riya manu rashmi");
	System.out.println(s3.replace(10, 16, "ramya"));
	StringBuilder s4=new StringBuilder("riya manu rashmi");
	System.out.println(s4.delete(10, 16));
	StringBuilder s5=new StringBuilder("Narayanaswamy");
	System.out.println(s5.reverse());
	StringBuilder s6=new StringBuilder("amulya satish mrudul");
	System.out.println(s6.substring(13));
	StringBuilder s7=new StringBuilder("vani santosh sushma");
	System.out.println(s7.capacity());

   }
}
