package oops;

class Car{
	String brand;
	int speed;
	int numberofseats;
	
	void drive()
	{
		System.out.println("Car of " + brand + " is running with the " + speed + " and has " + numberofseats);
	}
	void applyBreaks()
	{
		System.out.println("Car stopped");
	}
}

public class Oops {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand = "Maruthi";
		c1.speed = 50;
		c1.numberofseats = 6;
		c1.drive();
		c1.applyBreaks();
		
		Car c2 = new Car();
		c2.brand = "Innova";
		c2.speed = 60;
		c2.numberofseats = 8;
		c2.drive();
		c2.applyBreaks();

	}

}
