package assignment75;

public class Array_program {
	public static void main(String[]args)
	{
		int[]rollno1=new int[4];
		rollno1[0]=77;
		rollno1[1]=60;
		rollno1[2]=58;
		rollno1[3]=96;
		int sum=0;
		double average=0;
		for(int i=0; i<=rollno1.length-1; i++)
		{
			sum=sum+rollno1[i];
		}
		System.out.println(sum);
		average=sum/rollno1.length;
		System.out.println(average);
		}
		
	}


