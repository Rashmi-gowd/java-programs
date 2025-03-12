package assignment79;
import java.util.Arrays;
public class ReverseArray_program {
	public static void main(String[]args)
	{
		int array1[]=new int[4];
		array1[0]=45;
		array1[1]=78;
		array1[2]=65;
		array1[3]=98;
		int reverse[]=new int[array1.length];
		
		for(int i=0,j=3; i<=array1.length-1; i++,j--)
			
			
		{
			reverse[j]=array1[i];
			
		}
		System.out.println("input array :->"+Arrays.toString(array1));
		System.out.println("reversed array :->"+Arrays.toString(reverse));
		
			}

}
