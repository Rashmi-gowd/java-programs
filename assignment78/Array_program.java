package assignment78;
import java.util.Arrays;
public class Array_program {
	public static void main(String[]args)
	{
		int array1[]=new int[4];
		array1[0]=54;
		array1[1]=78;
		array1[2]=98;
		array1[3]=78;
		int array2[]=new int[array1.length];
		array2[0]=array1[0];
		array2[1]=array1[1];
		array2[2]=array1[2];
		array2[3]=array1[3];
		
	for(int i=0; i<array1.length; i++)
		{
			array2[i]=array1[i];
		}
			System.out.println("Input array:" +Arrays.toString(array1));
			System.out.println("copied array:"+Arrays.toString(array2));
		}
}


