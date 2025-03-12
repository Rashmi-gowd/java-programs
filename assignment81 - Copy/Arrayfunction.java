package assignment81;
import java.util.Arrays;
public class Arrayfunction {
	public static void main(String[]args)
	{
		String s1="rashmi";
		String s2="riya";
		int array1[]=new int[4];
		array1[0]=45;
		array1[1]=76;
		array1[2]=89;
		array1[3]=48;
		int reverse[]=new int[array1.length];
		for(int i=0, j=3; i<=array1.length-1; i++, j--)
		{
			reverse[j]=array1[i];
		}
		System.out.println("input array i->"+Arrays.toString(array1));
		System.out.println("reverse array i->"+Arrays.toString(reverse));
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println("after sorting is->");
		System.out.println(c1);
		System.out.println("after sorting is->");
		System.out.println(c2);
		}
	
	}


