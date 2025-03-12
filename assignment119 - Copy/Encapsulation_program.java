package assignment119;
class Encapsulation
{
	private String Emailid="contact@grotechminds.com";

	public String getEmailid() {
		return Emailid;
	}

	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
private int age=55;
public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
public class Encapsulation_program {
	public static void main(String[]args)
	{
		Encapsulation e1=new Encapsulation();
	e1.setEmailid("stbymkt@gmail.com");
	System.out.println(e1.getEmailid());
	e1.setAge(77);
	System.out.println(e1.getAge());

}
}




