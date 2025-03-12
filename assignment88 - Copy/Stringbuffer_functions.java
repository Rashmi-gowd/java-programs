package assignment88;

public class Stringbuffer_functions {
	public static void main(String[]args)
	{
		StringBuffer s1=new StringBuffer("Riya");
		s1.append(" Manu rashmi");
		System.out.println(s1);
		StringBuffer s2=new StringBuffer("riya manu rashmi");
		System.out.println(s2.insert(4, " manu"));
		StringBuffer s3=new StringBuffer("riya manu rashmi");
		System.out.println(s3.replace(10, 16, "ramya"));
		StringBuffer s4=new StringBuffer("riya manu rashmi");
		System.out.println(s4.delete(10, 16));
		StringBuffer s5=new StringBuffer("Narayanaswamy");
		System.out.println(s5.reverse());
		StringBuffer s6=new StringBuffer("amulya satish mrudul");
		System.out.println(s6.substring(13));
		StringBuffer s7=new StringBuffer("vani santosh sushma");
		System.out.println(s7.capacity());
		}
}
