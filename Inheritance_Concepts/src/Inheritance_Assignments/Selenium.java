package Inheritance_Assignments;

public class Selenium extends Automation {
	
	public Selenium()
	{
		super(10,20);
		System.out.println("Child default constructor");
	}
	
	public Selenium(int a)
	{
		this(10,20,30);
		System.out.println("Child one parameterized constructor");
	}
	
	public Selenium(int a,int b)
	{
		this(10);
		System.out.println("Child two parameterized constructor");
	}
	
	public Selenium(int a,int b,int c)
	{
		this();
		System.out.println("Child three parameterized constructor");
	}
	
	public static void main(String[] args) {
		
		Selenium s1=new Selenium(10,20);
		
	}
	
	
	
	

}
