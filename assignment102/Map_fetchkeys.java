package assignment102;
import java.util.HashMap;
import java.util.Map;
public class Map_fetchkeys {
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
	m2.put(12345676, "santosh");
	m2.put(54368900, "satish");
	m2.put(68293865, "amulya");
	m2.put(57829465, "mrudhul");
	m2.put(98782453, "sushma");
	System.out.println(m2);
	System.out.println("Fetching all the keys");
	for(Integer i1: m1.keySet())
		{
			System.out.println(i1);
		}
	 }
  }



