package assignment49;
abstract class Abstractclass3
{
	abstract void program1();
	abstract void program2();
}
abstract class Abstractclass2 extends Abstractclass3
{
	abstract void program3();
	abstract void program4();
}
public class Abstractclass1 extends Abstractclass2
{
	public static void main(String[]args)
	{
		System.out.println("execute all the programs");
	}

	void program3() {
		}

	void program4() {
		}

	void program1() {
		}

	void program2() {
		}
	}


