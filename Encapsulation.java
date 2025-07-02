package oops;

class Students
{
	private String name = "Priti";
	private int age = 25;
	
	static int getNameCount = 0;
	
	public String getName()
	{
		getNameCount++;
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		if(age<0)
			System.out.println("Invalid age");
		else
			this.age = age;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Students s1 = new Students();
		System.out.println(s1.getName() + " " + s1.getAge());
		s1.getName();
		
		Students s2 = new Students();
		s2.getName();
		System.out.println(s2.getName());
		System.out.println(Students.getNameCount);
		
		s2.setName("Vijay");
		System.out.println(s2.getName());
		
		s2.setAge(30);
		System.out.println(s2.getAge());
		
		
		


	}

}
