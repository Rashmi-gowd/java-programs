package assignment70;
public class Reversestring {
	public static void main(String[]args)
	{
		String input="Narayanaswamy";
		String revers="    ";
		{
			for(int i=input.length()-1; i>=0; i--)
			{
				char c1=input.charAt(i);
				revers=revers+c1;
				
			}
			System.out.println(revers);
			}
		}
	}


