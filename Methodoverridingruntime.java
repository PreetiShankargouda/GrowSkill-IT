package oops;

class Animal2
{
	void makeSound()
	{
		System.out.println("Animal is making sound");
	}
}
class Cow extends Animal2
{
	void makeSound()
	{
		System.out.println("Cow making sound");
	}
}
class Newdog extends Cow
{
	void makeSound()
	{
		System.out.println("Newdog making sound");
	}
}

public class Methodoverridingruntime {

	public static void main(String[] args) {
		Cow c1 = new Cow();
		c1.makeSound();
		
		Animal2 c2 = new Cow();
		c2.makeSound();
		
		Cow c3 = new Newdog();
		c3.makeSound();

	}

}
