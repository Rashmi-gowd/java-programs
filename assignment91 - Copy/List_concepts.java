package assignment91;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class List_concepts {
	public static void main(String[]args)
	{
		List<String> L1=new ArrayList<String>();
		L1.add("ramya");
		L1.add("rashmi");
		L1.add("manu");
		L1.add("riya");
		L1.add("narayanaswamy");
		L1.add(0,"radha");
		System.out.println(L1);
		System.out.println("Iteration starting:");
		Iterator<String> i2=L1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
}
