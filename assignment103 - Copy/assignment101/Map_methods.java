package assignment101;
import java.util.HashMap;
import java.util.Map;
public class Map_methods {
	public static void main(String[]args)
	{
		Map<Integer, String> m1=new HashMap<Integer, String>();
		m1.put(11223344, "rashmi");
		m1.put(22334455, "manu");
		m1.put(33445566, "riya");
		m1.put(44556677, "narayanaswamy");
		m1.put(55667788, "ramya");
		System.out.println(m1);
		Map<Integer, String> m2=new HashMap<Integer, String>();
		m2.put(12345676, "rashi");
		m2.put(54368900, "munjesh");
		m2.put(68293865, "rashika");
		m2.put(57829465, "nishi");
		m2.put(98782453, "rajesh");
		System.out.println(m2);
		boolean b1=m1.containsKey(11223344);
		System.out.println(b1);
		boolean b2=m1.containsValue("manu");
		System.out.println(b2);
		boolean b3=m1.equals(m2);
		System.out.println(b3);
		String s1=m1.get(33445566);
		System.out.println(s1);
		m1.putIfAbsent(55667788, "narayanaswamy");
		System.out.println(m1);
		}
}
