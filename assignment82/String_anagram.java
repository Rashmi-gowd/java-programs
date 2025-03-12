package assignment82;
import java.util.Arrays;
public class String_anagram {
	public static void main(String[]args)
	{
		String s1="post";
		String s2="stop";
		if(s1.length()!=s2.length())
				{
				System.out.println("They are not anagram");
				}else
				{
					System.out.println("Lets find out if they are anagram:");
				}
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("After sorting is->");
			System.out.println(c1);
			System.out.println("After sorting is->");
			System.out.println(c2);
			boolean b1=Arrays.equals(c1, c2);
			System.out.println(b1);
			if (b1==true)
			{
				System.out.println("It is a Anagram");
			}else
			{
				System.out.println("It is not a Anagram");
			}
		}
	}
