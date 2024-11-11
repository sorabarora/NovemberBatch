package Inheritance_Assignments;

public class Automation {
	
	public Automation()
	{
		this(10,20,30);
		System.out.println("Parent default constructor");
	}
	
	public Automation(int a)
	{
		this();
		System.out.println("Parent one parameterized constructor");
	}
	
	public Automation(int a,int b)
	{
		this(10);
		System.out.println("Parent two parameterized constructor");
	}
	
	public Automation(int a,int b,int c)
	{
		System.out.println("Parent three parameterized constructor");
	}

}
