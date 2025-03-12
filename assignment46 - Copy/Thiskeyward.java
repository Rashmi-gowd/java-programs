package assignment46;
public class Thiskeyward {
	String name;
	double salary;
	int age;
	
  void Employee_details(String name, double salary, int age)
		{
			this.name=name;
			this.salary=salary;
			this.age=age;
			{
				System.out.println("execute my name->"+name);
				System.out.println("execute my salary->"+salary);
				System.out.println("execute my age->"+age);
			}
		}
			public static void main(String[]args)
			{
			Thiskeyward T1=new Thiskeyward();
			T1.Employee_details("Manu", 75000 ,31);
			System.out.print(T1.name);
			System.out.print(T1.salary);
			System.out.print(T1.age);
		}
	}


