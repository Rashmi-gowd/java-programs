package assignment105;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Map_Iterator {
	public static void main(String[]args) {
		Map<Integer, String> m1=new HashMap<Integer, String>();
		m1.put(11223344, "rashmi");
		m1.put(22334455, "manu");
		m1.put(33445566, "riya");
		m1.put(44556677, "narayanaswamy");
		m1.put(55667788, "ramya");
		System.out.println(m1);
		Map<Integer, String> m2=new HashMap<Integer, String>();
		m2.put(12345676, "santosh");
		m2.put(54368900, "satish");
		m2.put(68293865, "amulya");
		m2.put(57829465, "mrudhul");
		m2.put(98782453, "sushma");
		System.out.println(m2);
		System.out.println("Iteration using Iterator");
		Set<Entry<Integer,String>> s2=m1.entrySet();
		Iterator<Entry<Integer,String>> s3=s2.iterator();
		while(s3.hasNext())
		{
			System.out.println(s3.next());
		}
	}
}
