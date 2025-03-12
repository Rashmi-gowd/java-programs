package assignment95;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Set_Iterator {
	public static void main(String[]args)
	{
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(77);
		s1.add(86);
		s1.add(87);
		s1.add(56);
		s1.add(79);
		s1.add(80);
		s1.add(87);
		s1.add(null);
		System.out.println(s1);
		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
