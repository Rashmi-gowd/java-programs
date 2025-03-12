package assignment85;
import java.util.Date;
public class Datefuturedate {
	public static void main(String[]args)
	{
	Date d1=new Date();
   System.out.println(d1);
	Date d2=new Date(d1.getTime()+(1000*60*60*24*2));
	System.out.println(d2);
   Date d3=new Date(d1.getTime()-(1000*60*60*24*2));
	System.out.println(d3);
	String format1=d1.toString();
	String month=format1.substring(4,7);
	System.out.println(month);
	String date=format1.substring(8, 10);
	System.out.println(date);
	String year=format1.substring(format1.length()-4);
	System.out.println(year);
	String format2=date.concat("_").concat(month).concat("_").concat(year);
	System.out.println(format2);
	String format3=date.concat("/").concat(month).concat("/").concat(year);
	System.out.println(format3);
	}
}
