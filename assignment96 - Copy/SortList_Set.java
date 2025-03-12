package assignment96;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class SortList_Set 
{
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
		Collections.sort(L1);
		System.out.println(L1);
		List<String> L2=new ArrayList<String>();
		L2.add("santosh");
		L2.add("satish");
		L2.add("uday");
		L2.add("ramesh");
		L2.add("kaushalya");
		L2.addAll(L1);
		System.out.println(L2);
	}
}

		
		
	


