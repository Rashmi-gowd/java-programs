package ab51;
import java.util.Scanner;
public class Scannerprogram {
 public static void main(String[]args)
	{
		Scanner s1=new Scanner(System.in);
	   double side, area, circumference;
		System.out.println("please enter square side:");
		side=s1.nextInt();
		area=side*side;
		circumference=4*side;
		System.out.println("area of a square= "+area);
		System.out.println("circumference of a square= "+circumference);
        s1.close();
		}
}


