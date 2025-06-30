package oops;

abstract class Animal
{
	abstract void sound();

	void sleep()
	{
		System.out.println("Animal is sleeping..");
	}
}
class dog extends Animal
{

	@Override
	void sound() {
		System.out.println("Dog barks");
		
	}
	
}
class cat extends Animal
{

	@Override
	void sound() {
		System.out.println("Meow");
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		Animal a1 = new dog();
		a1.sound();
		a1.sleep();
		
		Animal a2 = new cat();
		a2.sound();

	}

}
