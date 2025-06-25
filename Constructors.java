package oops;

class Student
{
	String name;
	int age;
	int id;
	
	Student()
	{
		System.out.println("Constructor called.....");
	}
	Student (String name, int age, int id)
	{
		this.name = name;
		this.age = age;
		this.id = id;
		System.out.println("Parameterized constructor...");
	}
	Student (Student s)
	{
		this.name = s.name;
		this.age = s.age;
		this.id = s.id;
		System.out.println("Copy Consutructor...");
	}
	void printinfo()
	{
		System.out.println(name + " " + age + " " + id );
	}
}

public class Constructors {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Preeti";
		s1.age = 24;
		s1.id = 1;
		s1.printinfo();
		
		Student s2 = new Student ("Pinky", 18, 2);
		s2.printinfo();
		
		Student s3 = new Student(s1);
		s3.printinfo();

	}

}
