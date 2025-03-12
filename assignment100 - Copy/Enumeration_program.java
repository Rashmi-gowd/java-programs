package assignment100;
import java.util.Enumeration;
import java.util.Vector;
public class Enumeration_program {
public static void main(String[]args)
{
	Vector v=new Vector();
	v.add(70);
	v.add("rashmi");
	v.add(77.76);
	Enumeration e=v.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
   }
}
