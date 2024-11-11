package Inheritance_Assignments;

public class Selenium_1 extends Automation_1 {
	
	public void method()
	{
		System.out.println("Child default method");
	}
	
	public void method1(int a)
	{
		System.out.println("Child one parameterized method");
		super.a=10;
		System.out.println("The value of a is "+a);
	}
	
	public void method2(int a,int b)
	{
		
		super.m3(10, 20, 30);
		super.m();
		super.m1(10);
		super.m2(10,20);
		System.out.println("Child two parameterized method");
	}
	
	public void method3(int a,int b,int c)
	{
		System.out.println("Child three parameterized method");
	}
	
	public static void main(String[] args) {
		
		Selenium_1 s1=new Selenium_1();
		s1.method2(10, 20);
		s1.method();
		s1.method3(10, 20, 30);
		s1.method1(10);
		
		
		
		
	}

}
