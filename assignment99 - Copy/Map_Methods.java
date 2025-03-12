package assignment99;
import java.util.HashMap;
import java.util.Map;
public class Map_Methods {
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
		m2.putAll(m1);
		System.out.println(m2);
		m2.remove(54368900);
		System.out.println(m2);
	    m2.remove(68293865, "rashika");
		System.out.println(m2);
		m2.replace(98782453, "rajesh rathod");
		System.out.println(m2);
		m2.replace(57829465, "nishi", "nishi nayana");
		System.out.println(m2);
		m2.clear();
		System.out.println(m2);
		boolean b1=m2.isEmpty();
		System.out.println(b1);
		}
	}
