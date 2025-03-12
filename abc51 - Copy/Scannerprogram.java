package abc51;
import java.util.Scanner;
public class Scannerprogram {
	public static void main(String[]args)
	{
		Scanner s1=new Scanner(System.in);
		double circumference,side;
		System.out.println("please enter circumference side:");
		side=s1.nextInt();
	 circumference=4*side;
		System.out.println("circumference of a square= "+circumference);
        s1.close();
		
	}
	
}
