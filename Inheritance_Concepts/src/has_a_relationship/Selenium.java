package has_a_relationship;

public class Selenium {
	
	public void method3()
	{
		System.out.println("Child default method");
	}
	
	public void method4(int a)
	{
		System.out.println("Child one parameterized method");
	}
	
	public static void main(String[] args) {
		
		Automation a1=new Automation();  // has a relationship
		a1.method1();
		a1.method2(10);
		Selenium s1=new Selenium();
		s1.method3();
		s1.method4(20);
		
	}

}
