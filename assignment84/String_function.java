package assignment84;
public class String_function {
	public static void main(String[]args)
	{
		String name="school name is chethana";
		String a1=name.replace('m', 'a');
		System.out.println(a1);
		String name1="school name is abc";
		String a2=name.replace("abc", "dcd");
		System.out.println(a2);
		String name2="Riya Manu Rashmi 143";
		String s1=name2.replaceAll("[A-Z]", " ");
		System.out.println(s1);
		String s2=name2.replaceAll("[a-z]", " ");
		System.out.println(s2);
		String s5="rashmi";
		String output=s5.repeat(0);
		System.out.println(output);
		String s="riya";
		boolean b1=s.matches("....");
		System.out.println(b1);
		boolean b2=s.matches("(.)*a");
		System.out.println(b2);
		boolean b3=s.matches("r(.)*");
		String p="spiderman";
		boolean b4=p.matches("(.)*man(.)*");
	    System.out.println(b4);
	}
}
