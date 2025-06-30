package oops;

interface vehicle
{
	void start();
}
class Bike implements vehicle
{

	@Override
	public void start() {
		System.out.println("Bike started....");
		
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		
		vehicle v1 = new Bike();
		v1.start();

	}

}
