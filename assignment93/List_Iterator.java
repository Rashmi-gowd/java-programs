package assignment93;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class List_Iterator {
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
	System.out.println("List Iteration Starting:");
	ListIterator<String> i3=L1.listIterator();
	System.out.println("Forawrd Iteration:");
	while(i3.hasNext())
	{
		System.out.println(i3.next());
	}
	System.out.println("Backward Iteration:");
	while(i3.hasPrevious())
	{
		System.out.println(i3.previous());
		}
	}
}
