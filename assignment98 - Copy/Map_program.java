package assignment98;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Map_program {
	public static void main(String[]args)
	{
		Map<Integer, String> m1=new HashMap<Integer, String>();
		Scanner S1=new Scanner(System.in);
        System.out.println("Please enter the account holder number");
	    System.out.println("Please enter the name");
		int Accountnumber=S1.nextInt();
		String Name=S1.next();
	    S1.close();
	}
}
