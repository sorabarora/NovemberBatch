package hierachical_Inheritance;

public class Selenium extends Automation {
	
	public void method2()
	{
		System.out.println("Son1 Class");
	}
	
	public static void main(String[] args) {
		
		Selenium s1=new Selenium();
		s1.method1();
		s1.method2();
		s1.a=10;
		System.out.println("The value of a is "+s1.a);
	}

}
