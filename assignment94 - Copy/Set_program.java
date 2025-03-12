package assignment94;
import java.util.HashSet;
import java.util.Set;
public class Set_program {
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
		}
}
