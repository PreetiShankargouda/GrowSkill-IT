package oops;

interface Payment
{
	void makePayment(double amount);
	default void publicMethod()
	{
		privateMethod();
	}
	private void privateMethod()
	{
		System.out.println("Private Method");
	}
	static void staticMethod()
	{
		System.out.println("Static method");
	}
}
class CreditPayment implements Payment
{
	public void makePayment(double amount)
	{
		System.out.println("Credit card payment completed.....");
	}
}
class UPIPayment implements Payment
{
	public void makePayment(double amount)
	{
		System.out.println("UPI payment completed.....");
	}
}

public class Interfacesexampleone {

	public static void main(String[] args) {
		Payment P1 = new CreditPayment();
		P1.makePayment(0);
		
		Payment P2 = new UPIPayment();
		P2.makePayment(0);
		
		Payment.staticMethod();
		
	}

}
