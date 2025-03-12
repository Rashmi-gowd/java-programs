package assignment71;
public class String_palindrome 
{
	public static void main(String[]args)
	{
    String input=  "mom";
	String reverse=" ";
	for(int i=input.length()-1; i>=0; i--)
		{
		char c1= input.charAt(i);
           reverse=reverse+c1;
		}
	System.out.println(reverse);
    if(input.equals(reverse))
			{
				System.out.println("the given word is palindrome");
			}
		else
			{
				System.out.println("the given word is not a palindrome");
			}
     }

}
	

		
	
