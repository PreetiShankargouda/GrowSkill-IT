package oops;

class Calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	
	double add(double a, double b)
	{
		return a+b;
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
}


public class Methodoverloadingcompiletime {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.add(2,5));
		System.out.println(c1.add(5.5,4.3));
		System.out.println(c1.add(2,5,8));

	}

}
