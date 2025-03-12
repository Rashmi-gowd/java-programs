package Practiceassignment;
import java.util.Collections;
import java.util.LinkedList;


public class Practice {
	
	public static void main(String[]args)
	{
		LinkedList L1=new LinkedList();
		L1.add("cat");
		L1.add("rashmi");
		L1.add("adhi");
		//L1.add('y');
		//L1.add(null);
		//L1.add(null);
		L1.add("adhi");
		Collections.sort(L1);
		System.out.println(L1);
		
		
	}

}
